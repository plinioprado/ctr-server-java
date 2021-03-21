package com.pocspring1.springboot.Entity;

import javax.xml.bind.ValidationException;
import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private String cod;
    private LocalDate dt;
    private float val;
    private Party cp;
    private List<Receivable> recList;

    public Invoice(String cod, LocalDate dt, float val, Party cp, List<Receivable> recList) {
        this.setCod(cod);
        this.setDt(dt);
        this.setVal(val);
        this.setCp(cp);
        this.setRecList(recList);
    }

    public Invoice() {}

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setDt(LocalDate dt) {
        this.dt = dt;
    }

    public void setVal(float val) {
        this.val = val;
    }

    public void setCp(Party cp) {
        this.cp = cp;
    }

    public void setRecList(List<Receivable> recList) {
        this.recList = recList;
    }

    public String getCod() {
        return cod;
    }

    public LocalDate getDt() {
        return dt;
    }

    public float getVal() {
        return val;
    }

    public Party getCp() {
        return this.cp;
    }

    public List<Receivable> getRecList() {
        return recList;
    }

    public void validate() throws Exception {
        this.validateCod(this.cod);
        this.validateDt(this.dt);
        this.validateVal(this.val);
    }

    public void validateCod(String cod) throws ValidationException {
        try {
            int number = Integer.parseInt(cod);
            if (number < 0) throw new ValidationException("Invalid Cod (value < 0)");
        } catch (NumberFormatException e) {
            throw new ValidationException("Invalid Cod (not numeric)");
        }
    }

    public void validateCodCreate() throws ValidationException {
        if (!this.cod.equals("0")) throw new ValidationException("Invalid Cod (value not '0' in create)");
    }

    public void validateCodUpdate() throws ValidationException {
        if (this.cod.equals("0")) throw new ValidationException("Invalid Cod (value '0' in update)");
    }

    public void validateDt(LocalDate dt) throws ValidationException {
        if (dt == null || dt.toString().equals("") ) throw new ValidationException("Invalid Date issue (blank)");
    }

    public void validateVal(float val) throws ValidationException {
        if (val <= 0F) throw new ValidationException("Invalid Value");
    }
}
