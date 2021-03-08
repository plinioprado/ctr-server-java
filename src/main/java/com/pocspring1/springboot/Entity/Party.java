package com.pocspring1.springboot.Entity;

public class Party {
    private String cod;
    private String name;
    private Address address;

    public Party(String cod, String name, Address address) {
        this.setCod(cod);
        this.setName(name);
        this.setAddress(address);
    }

    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
