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

    public LoginResponseBody login() {
        LoginResponseBody loginResponse = new LoginResponseBody();

        loginResponse.setEntity(new BaseParty("Example Services Ltd.","001", "Example"));

        User user = userService.gerByEmail("john@example.com");
        loginResponse.setUser(user);

        loginResponse.setToken("123321");

        return loginResponse;
    }
}
