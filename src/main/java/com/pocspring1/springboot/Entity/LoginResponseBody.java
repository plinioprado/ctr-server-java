package com.pocspring1.springboot.Entity;

public class LoginResponseBody {
    String configData;
    String userData;
    String token;

    public LoginResponseBody() {
        this.configData = "aaa";
        this.userData = "bbb";
        this.token = "123321";
    }

    public String getConfigData() {
        return configData;
    }

    public String getUserData() {
        return userData;
    }

    public String getToken() {
        return token;
    }
}
