package com.pocspring1.springboot.Service;

import com.pocspring1.springboot.Entity.BaseParty;
import com.pocspring1.springboot.Entity.LoginResponseBody;
import com.pocspring1.springboot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserService userService;

    public LoginResponseBody login(String email, String pass) {

        User user = userService.getByEmail(email);
        if (user == null || !user.getPass().equals(pass)) return null;

        LoginResponseBody loginResponse = new LoginResponseBody();
        loginResponse.setEntity(new BaseParty("Example Services Ltd.","001", "Example"));
        loginResponse.setUser(user);
        loginResponse.setToken("123321");

        return loginResponse;
    }
}
