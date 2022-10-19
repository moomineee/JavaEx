package com.likelion.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //Spring의 시작.    @RestController or @Controller에서 시작. SpringBoot
public class UserDaoFactory {
    //조립을 해준다.
    @Bean
    public UserDao awsUserDao() {  //aws커넥션을 쓰는 userdao
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }
    @Bean
    public UserDao localUserDao() {  //
        UserDao userDao = new UserDao(new LocalConnectionMaker());
        return userDao;
    }
}
