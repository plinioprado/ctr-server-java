package com.pocspring1.springboot.Entity;

public class LoginRequestBody {

    String email;
    String pass;

    public LoginRequestBody(String email, String pass) {
        this.setEmail(email);
        this.setPass(pass);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
