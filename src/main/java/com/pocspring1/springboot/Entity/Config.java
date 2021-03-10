package com.pocspring1.springboot.Entity;

public class Config {

    private BaseParty entity;
    private boolean active;

    public Config() {
        this.active = true;
        this.entity = new BaseParty("Example Services Ltd", "001", "Example");
    }

    public BaseParty getEntity() {
        return entity;
    }

    public boolean isActive() {
        return active;
    }
}
