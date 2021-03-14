package com.pocspring1.springboot.Entity;

public class User {
    private int num;
    private String name;
    private String email;
    private String pass;
    private Boolean active;
    private String std;
    private String fullName;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public User(int num, String name, String email, String pass, Boolean active, String std, String fullName) {
        this.setNum (num);
        this.setName(name);
        this.setEmail(email);
        this.setPass(pass);
        this.setActive(active);
        this.setStd(std);
        this.setFullName(fullName);
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
