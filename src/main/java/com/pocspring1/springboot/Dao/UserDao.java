package com.pocspring1.springboot.Dao;

import com.pocspring1.springboot.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        users.add(new User("John", "john@example.com", "123456", true, "user", "John Smith"));
        users.add(new User("Mary", "mary@example.com", "123456", true, "user", "Mary Smith"));
        users.add(new User("Super", "super@example.com", "123456", true, "super", "Super admin"));

        return users;
    }

    public User getByEmail(String email) {
        return new User("John", "john@example.com", "123456", true, "user", "John Smith");
    }
}
