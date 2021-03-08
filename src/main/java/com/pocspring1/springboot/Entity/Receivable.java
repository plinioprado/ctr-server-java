package com.pocspring1.springboot.Entity;

import java.util.Date;

public class Receivable {
    private Date dt;
    private Float val;

    public Receivable(Date dt, Float val) {
        this.setDt(dt);
        this.setVal(val);
    }

    public Date getDt() {
        return dt;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Float getVal() {
        return val;
    }

    public void setVal(Float val) {
        this.val = val;
    }
}
