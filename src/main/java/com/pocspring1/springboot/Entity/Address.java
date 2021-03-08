package com.pocspring1.springboot.Entity;

public class Address {
    private String addr;
    private String city;
    private String state;
    private String zip;
    private String country;

    public Address(String addr, String city, String state, String zip, String country) {
        this.setAddr(addr);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
        this.setCountry(country);
    }

    public Address() {}

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
