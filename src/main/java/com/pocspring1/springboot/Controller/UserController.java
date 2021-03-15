package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.User;
import com.pocspring1.springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAll() {
        try {
            List<User> userList = this.userService.getAll();
            return ResponseEntity.status(200).body(userList);
        } catch (Exception e) {
            return getErrorResponse(500, e.getMessage());
        }
    }

}
