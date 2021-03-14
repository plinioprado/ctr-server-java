package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.LoginRequestBody;
import com.pocspring1.springboot.Entity.LoginResponseBody;
import com.pocspring1.springboot.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity login(LoginRequestBody requestBody) {
        try {
            System.out.println("in /login-post");
            String email = "john.doe@example.com";
            String pass = "123456";
            LoginResponseBody response = loginService.login(email, pass);
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return getErrorResponse(500, e.getMessage());
        }
    }

}