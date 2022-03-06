package com.ltphat.selfstudy.designpattern.builder;

public class Address {
    private int number;
    private String street;
    private String district;

    public Address(int number, String street, String district) {
        this.number = number;
        this.street = street;
        this.district = district;
    }
}
