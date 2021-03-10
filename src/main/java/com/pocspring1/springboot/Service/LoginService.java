package com.pocspring1.springboot.Service;

import com.pocspring1.springboot.Entity.BaseParty;
import com.pocspring1.springboot.Entity.Config;
import com.pocspring1.springboot.Entity.LoginResponseBody;
import com.pocspring1.springboot.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public LoginResponseBody login() {
        LoginResponseBody loginResponse = new LoginResponseBody();
        loginResponse.setConfigData(new Config(true, new BaseParty("Example Services Ltd.","001", "Example")));
        loginResponse.setUserData(new User("John", "john@example.com", "123456", true, "user", "John Smith"));
        loginResponse.setToken("123321");
        return loginResponse;
    }
}
