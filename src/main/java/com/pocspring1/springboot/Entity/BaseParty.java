package com.pocspring1.springboot.Entity;

public class BaseParty {
    private String name;
    private String cod;
    private String shortName;

    public BaseParty(String name, String cod,  String shortName) {
        this.name = name;
        this.cod = cod;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public String getCod() {
        return cod;
    }

    public String getShortName() {
        return shortName;
    }
}
