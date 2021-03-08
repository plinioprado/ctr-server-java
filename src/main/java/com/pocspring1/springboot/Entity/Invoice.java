package com.pocspring1.springboot.Entity;

import javax.xml.bind.ValidationException;
import java.util.Date;
import java.util.List;

public class Invoice {
    private String cod;
    private Date dt;
    private float val;
    private Party cp;
    private List<Receivable> recList;

    public Invoice(String cod, Date dt, float val, Party cp, List<Receivable> recList) {
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

    public void setDt(Date dt) {
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

    public Date getDt() {
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
        int number;
        try {
            number = Integer.parseInt(cod);
        } catch (NumberFormatException e) {
            number = 0;
        }
        if (number < 1) throw new ValidationException("Invalid Cod (blank)");
    }

    public void validateDt(Date dt) throws ValidationException {
        if (dt == null || dt.equals("") ) throw new ValidationException("Invalid Date issue (blank)");
    }

    public void validateVal(float val) throws ValidationException {
        if (val <= 0F) throw new ValidationException("Invalid Value");
    }
}
