package com.pocspring1.springboot.Controller;

import com.pocspring1.springboot.Entity.ErrorResponseBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BaseController {

    ResponseEntity getErrorResponse(int errorCode, String message) {
        ErrorResponseBody errorBody = new ErrorResponseBody(errorCode, message);
        return ResponseEntity.status(errorCode).body(errorBody);
    }

}
