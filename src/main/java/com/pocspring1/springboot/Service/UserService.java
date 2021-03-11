package com.pocspring1.springboot.Service;

import com.pocspring1.springboot.Dao.UserDao;
import com.pocspring1.springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAll() {
        return userDao.getAll();
    }

    public User gerByEmail(String email) {
        return userDao.getByEmail(email);
    }
}
