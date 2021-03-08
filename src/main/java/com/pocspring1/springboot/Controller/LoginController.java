package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.ErrorResponseBody;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/login",
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class LoginController {

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

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> index() {
        System.out.println("in /login-post");
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>("Login-post", responseHeaders, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> indexGet() {
        System.out.println("in /login-get");
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>("Login-get", responseHeaders, HttpStatus.OK);
    }

    private ResponseEntity getErrorResponse(int errorCode, String message) {
        ErrorResponseBody errorBody = new ErrorResponseBody(errorCode, message);
        return ResponseEntity.status(errorCode).body(errorBody);
    }

}