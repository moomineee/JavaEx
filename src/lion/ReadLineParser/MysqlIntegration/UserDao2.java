package com.dbexercise;

import com.dbexercise.domain.User;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Map;

// PW, HOST 은닉하기. 환경변수 설정(Edit Configuration)
public class UserDao2 {
    public void add() throws SQLException, ClassNotFoundException {
        Map<String , String> env = System.getenv();  // getEnvironment : host user password를 받는다.
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");


        Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection : DB와 연결을 위해 URL과 계정정보를 필요로 한다.  =  DriverManger.getConnection(url, id, pw);
        Connection con = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO  users(id, name, password) VALUES (?, ?, ?)");
        // workbench에서 데이터를 직접 입력하는 것.
        pstmt.setString(1, "1");   // 쿼리를 입력하는 것
        pstmt.setString(2, "KiMoon");
        pstmt.setString(3, "1123");

        int status = pstmt.executeUpdate(); // workbench의 ctrl+enter.(데이터 insert) = 쿼리 실행
        // SQL Query문이 INSERT, DELETE, UPDATE일 경우 사용. 반환값의 타입은 INT형.
        // executeQuery는 SQL Query문이 SELECT의 경우 사용.

        pstmt.close(); // connection, Statement, Resultset에 대해 close를 해줘야 한다. 여기서는 connection close.
        con.close();
    }

    // select 기능 만들기, user가 없으니 만들어준다. domain 하위
    public User get(String id) throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbUser = env.get("DB_USER");
        String dbPassword = env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = con.prepareStatement("SELECT id, name, password FROM users WHERE id = ?");
        ps.setString(1, id); // id는 id는 get(String id)로 받는 id
        ResultSet rs = ps.executeQuery(); // 쿼리 실행 결과가 담겨있다. ex) SELECT * FROM users WHERE id = 1;
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"),
                rs.getString("password"));
        rs.close();
        ps.close();
        con.close();
        return user;
    }

    public User select(String id) throws SQLException {
        Map<String, String> env = System.getenv();
        Connection connection = DriverManager.getConnection(env.get("DB_HOST"), env.get("DB_USER"), env.get("DB_PASSWORD"));
        PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM  users where id = ?");
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        User user = new User(rs.getString("id"), rs.getString("name"), rs.getString("password"));
        rs.close();
        pstmt.close();
        connection.close();

        return user;
    }

    // 여러개 받아오고 싶을 때
//    while(rs.next() != null) {}

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao2 userDao2 = new UserDao2();
//        userDao2.add(); // add를 해줘야 insert가 된다.
        User user = userDao2.get("1");
        System.out.println(user.getName());
    }
}
