package com.pocspring1.springboot.Entity;

public class ErrorResponseBody {

    String error;

    public ErrorResponseBody(String error) {
        setErrorMessage(error);
    }

    public String getErrorMessage() {
        return error;
    }

    public void setErrorMessage(String error) {
        this.error = error;
    }
}
