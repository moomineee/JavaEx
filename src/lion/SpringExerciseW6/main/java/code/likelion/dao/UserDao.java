package code.likelion.dao;

import code.likelion.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Map;

public class UserDao {

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;

//    public UserDao(DataSource dataSource) {
//        this.dataSource = this.dataSource;
//    }

    public UserDao(DataSource awsDataSource) {

    }


    public void deleteAll() throws SQLException {

//        StatementStrategy deleteAllStrategy = new StatementStrategy() {
//            @Override
//            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
//                return connection.prepareStatement("DELETE FROM users");
//            }
//        };
        jdbcContextWithStatementStrategy(new StatementStrategy() {
            @Override
            public PreparedStatement makePreparedStatement(Connection connection) throws SQLException {
                return connection.prepareStatement("DELETE FROM users");
            }
        });
    }


        public int getCount() throws SQLException {
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            c = dataSource.getConnection();
            ps = c.prepareStatement("select count(*) from users");
            rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            throw e;
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    public void add(User user) throws SQLException {
        AddStrategy addStrategy = new AddStrategy(user);
        jdbcContextWithStatementStrategy(addStrategy);
    }

    public User findById(String id) {
        Map<String, String> env = System.getenv();
        Connection c;
        try {
            // DB접속 (ex sql workbeanch실행)
            c = dataSource.getConnection();

            // Query문 작성
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM users WHERE id = ?");
            pstmt.setString(1, id);

            // Query문 실행
            ResultSet rs = pstmt.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User(rs.getString("id"), rs.getString("name"),
                        rs.getString("password"));
            }

            rs.close();
            pstmt.close();
            c.close();

            if (user == null) throw new EmptyResultDataAccessException(1);

            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    public static void main(String[] args) {
//        UserDao userDao = new UserDao();
////        userDao.add();
//        User user = userDao.findById("6");
//        System.out.println(user.getName());
//    }
}