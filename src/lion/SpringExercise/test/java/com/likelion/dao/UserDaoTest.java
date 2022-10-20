package com.likelion.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.likelion.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)
class UserDaoTest {

    @Autowired
    ApplicationContext context;

    UserDao userDao;
    User user1;
    User user2;
    User user3;

    @BeforeEach
    void setUp() {
        this.userDao = context.getBean("awsUserDao", UserDao.class);
        this.user1 = new User("1", "kyeonghwan", "1243");
        this.user2 = new User("2", "sohyeon", "1241");
        this.user3 = new User("3", "sujin", "4232");

    }

    @Test
    void addAndGet() throws SQLException {


        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        String id = "29";
        userDao.add(new User(id, "EternityHwan", "1234"));
        assertEquals(1, userDao.getCount());

        User user = userDao.findById(id);
        assertEquals("EternityHwan", user.getName());
        assertEquals("1234", user.getPassword());
    }

    @Test
    void count() throws SQLException {

        userDao.deleteAll();
        assertEquals(0, userDao.getCount());

        userDao.add(user1);
        assertEquals(1,userDao.getCount());
        userDao.add(user2);
        assertEquals(2,userDao.getCount());
        userDao.add(user3);
        assertEquals(3,userDao.getCount());

    }

    @Test
    void findByID() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            userDao.findById("30");
        });
    }
}