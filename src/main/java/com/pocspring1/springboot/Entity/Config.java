package com.pocspring1.springboot.Entity;

public class Config {

    private BaseParty entity;
    private boolean active;

    public Config(Boolean active, BaseParty baseParty) {
        this.active = active;
        this.entity = baseParty;
    }

    public BaseParty getEntity() {
        return entity;
    }

    public boolean isActive() {
        return active;
    }
}
