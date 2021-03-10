package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.LoginRequestBody;
import com.pocspring1.springboot.Entity.LoginResponseBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController extends BaseController {

    /*
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> login(@RequestBody LoginRequestBody requestBody) {
        System.out.println("in /login-post");
        try {
            System.out.println("email=" + requestBody.getEmail());
            System.out.println("pass=" + requestBody.getPass());
            HttpHeaders responseHeaders = new HttpHeaders();
            throw new Exception("Invalid login");
        } catch (Exception e) {
            System.out.println("Debug error : " + e.getMessage() + "," + e.getCause());
            return getErrorResponse(401, e.getMessage());
        }
    }
    */

    @RequestMapping(value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> login(LoginRequestBody requestBody) {
        try {
            System.out.println("in /login-post");
            System.out.println("email=" + requestBody.getEmail());
            System.out.println("pass=" + requestBody.getPass());
            LoginResponseBody response = new LoginResponseBody();
            return ResponseEntity.status(200).body(response);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return getErrorResponse(500, e.getMessage());
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> loginGet() {
        try {
            System.out.println("in /login-get");
            if (1 == 1) throw new ValidationException("error in /login-get");
            return ResponseEntity.status(200).body("{ \"message\": \"Hi\"}");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return getErrorResponse(500, e.getMessage());
        }
    }

}