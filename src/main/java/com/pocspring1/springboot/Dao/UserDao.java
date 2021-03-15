package com.pocspring1.springboot.Dao;

import com.pocspring1.springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"John", "john@example.com", "123456", true, "user", "John Smith"));
        users.add(new User(2,"Mary", "mary@example.com", "123456", true, "user", "Mary Smith"));
        users.add(new User(3,"Super", "super@example.com", "123456", true, "super", "Super admin"));
    }

    public List<User> getAll() {
        return users;
    }

    public User getByEmail(String userEmail) {
        User user = null;

        for (User value : users) {
            if (value.getEmail().equals(userEmail)) {
                user = value;
                break;
            }
        }

        return user;
    }
}
