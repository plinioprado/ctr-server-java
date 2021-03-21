package com.pocspring1.springboot.Entity;

import java.time.LocalDate;

public class Receivable {

    private int seq;
    private LocalDate dtDue;
    private Float val;

    public Receivable(int seq, LocalDate dtDue, Float val) {
        this.setSeq(seq);
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

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
}
