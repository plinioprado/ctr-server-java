package com.pocspring1.springboot.Entity;

import javax.xml.bind.ValidationException;
import java.util.Date;

public class Invoice {
    private int number;
    private Date dateIssue;
    private String clientName;
    private float value;

    public Invoice(int number, Date dateIssue, String clientName, float value) {
        this.setNumber(number);
        this.setDateIssue(dateIssue);
        this.setClientName(clientName);
        this.setValue(value);
    }

    public Invoice() {}

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public String getClientName() {
        return clientName;
    }

    public float getValue() {
        return value;
    }

    public void validate() throws Exception {
        this.validateNumber(this.number);
        this.validateDateIssue(this.dateIssue);
        this.validateClientName(this.clientName);
        this.validateValue(this.value);
    }

    public void validateNumber(Integer number) throws ValidationException {
        if (number == null || number < 1) throw new ValidationException("Invalid Number (blank)");
    }

    public void validateDateIssue(Date dateIssue) throws ValidationException {
        if (dateIssue == null || dateIssue.equals("") ) throw new ValidationException("Invalid Date issue (blank)");
    }

    public void validateClientName(String clientName) throws ValidationException {
        if (clientName == null || clientName.equals("") ) throw new ValidationException("Invalid Client name (blank)");
    }

    public void validateValue(float value) throws ValidationException {
        if (value <= 0F) throw new ValidationException("Invalid Value");
    }
}
