package com.likelion.dao;

import com.line.dao.ConnectionMaker;

import java.sql.Connection;
import java.sql.SQLException;

public class LocalConnectionMaker implements ConnectionMaker {
    @Override
    public Connection makeConnection() throws SQLException {

        return null;
    }
}