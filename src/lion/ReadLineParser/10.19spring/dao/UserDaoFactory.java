package com.likelion.dao;

import com.likelion.dao.AWSConnectionMaker;
import com.likelion.dao.LocalConnectionMaker;
import com.likelion.dao.UserDao;

public class UserDaoFactory {
    //조립을 해준다.
    public UserDao awsUserDao() {  //aws커넥션을 쓰는 userdao
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    public UserDao localUserDao() {  //
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
}
