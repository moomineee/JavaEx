package com.dbexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 이건 위험하다. password와 주소가 모두 노출되어있어 해킹당함.

public class UserDao {
    public void add() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql:// (PublicDNS4Adress) /likelion-db", "root", "145678"
        );
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values(?, ?, ?)"
        );
        ps.setString(1, "0");
        ps.setString(2, "KiMoon");
        ps.setString(3, "1123");

        int status = ps.executeUpdate();
        ps.close();
        ps.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        userDao.add();  // 여기를 입력해줘야 데이터가 insert된다.
    }
}
