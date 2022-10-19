package com.line.dao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class ConnectionMaker {
    public abstract Connection makeConnection() throws SQLException;
}
