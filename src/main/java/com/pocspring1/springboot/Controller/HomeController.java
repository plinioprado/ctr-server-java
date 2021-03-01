package com.pocspring1.springboot.Controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> index() {
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>("Home", responseHeaders, HttpStatus.OK);
    }

}