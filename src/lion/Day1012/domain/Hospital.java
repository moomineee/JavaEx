package com.line.domain;

public class Hospital {
    private String id;

    public Hospital(String id) {
        this.id = id;

    }

    public String getId() {
        return id;
    }

    private String address;
    private String district;
    private String category;
    private Integer emergency_room; // snake camel
    private String name; // snake camel
    private String subdivision; // snake camel




}
