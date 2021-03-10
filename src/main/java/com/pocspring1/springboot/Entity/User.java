package com.pocspring1.springboot.Entity;

public class User {
    private String name;
    private String email;
    private String pass;
    private Boolean active;
    private String std;
    private String fullName;

    public User(String name, String email, String pass, Boolean active, String std, String fullName) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.active = active;
        this.std = std;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public Boolean getActive() {
        return active;
    }

    public String getStd() {
        return std;
    }

    public String getFullName() {
        return fullName;
    }
}
