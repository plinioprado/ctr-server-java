package com.pocspring1.springboot.Entity;

public class LoginResponseBody {
    private Config configData;
    private User userData;
    private String token;

    public LoginResponseBody() {
    }

    public void setConfigData(Config configData) {
        this.configData = configData;
    }

    public void setUserData(User userData) {
        this.userData = userData;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Config getConfigData() {
        return configData;
    }

    public User getUserData() {
        return userData;
    }

    public String getToken() {
        return token;
    }
}
