package com.pocspring1.springboot.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> index() {
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>("Home", responseHeaders, HttpStatus.OK);
    }

}