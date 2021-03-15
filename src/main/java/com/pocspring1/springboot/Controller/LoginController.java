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
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    LoginService loginService;

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> login(LoginRequestBody requestBody) {
        try {
            System.out.println("in /login-post");
            String email = "john@example.com";
            String pass = "123456";
            LoginResponseBody response = loginService.login(email, pass);
            if (response == null) {
                return getErrorResponse(403, "Error: invalid login");
            }
            return ResponseEntity.status(200).body(response);
        } catch (NullPointerException e) {
            return getErrorResponse(403, e.getMessage());
        } catch (Exception e) {
            return getErrorResponse(500, e.getMessage());
        }
    }

}