package com.pocspring1.springboot.Entity;

public class ErrorResponseBody {

    int status;
    String statusText;

    public ErrorResponseBody(int status, String statusText) {
        setStatus(status);
        setStatusText(statusText);
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusText() {
        return this.statusText;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
}
