package com.pocspring1.springboot.Entity;

import java.time.LocalDate;

public class Receivable {
    private LocalDate dtDue;
    private Float val;

    public Receivable(LocalDate dtDue, Float val) {
        this.setDtDue(dtDue);
        this.setVal(val);
    }

    public LocalDate getDtDue() {
        return dtDue;
    }

    public void setDtDue(LocalDate dt) {
        this.dtDue = dt;
    }

    public Float getVal() {
        return val;
    }

    public void setVal(Float val) {
        this.val = val;
    }
}
