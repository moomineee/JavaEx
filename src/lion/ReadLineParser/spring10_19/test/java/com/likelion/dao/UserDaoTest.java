package com.likelion.dao;

import com.likelion.dao.UserDaoFactory;
import com.likelion.dao.UserDao;
import com.likelion.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class) // 이 클래스만 특정해서 테스트하는 것
class UserDaoTest {
//    1.UserDao오버로딩한 ConnectionMaker를 받아서 초기화 하는 Constructor가 잘 작동 하는지
//    2.새로 바뀐 ConnectionMaker interface를 의존하는 구조도 잘 작동 하는지
//    3.ConnectionMaker interface 구현한 AwsConnectionMaker가 잘 작동하는지

    @Autowired
    ApplicationContext context;
    @Test
    void addAndSelect() {
//        UserDao userDao = new UserDao(new AWSConnectionMaker());
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        String id = "22";
        userDao.add(new User(id, "Rara", "1123"));

        User user = userDao.findById(id);
        Assertions.assertEquals("Rara", user.getName());
    }
}