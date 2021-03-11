package com.pocspring1.springboot.Entity;

public class LoginResponseBody {
    private User user;
    private String token;
    private BaseParty entity;

    public BaseParty getEntity() {
        return entity;
    }

    public void setEntity(BaseParty entity) {
        this.entity = entity;
    }

    public LoginResponseBody() {
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public String getToken() {
        return token;
    }
}
