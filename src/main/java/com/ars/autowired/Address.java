package com.ars.autowired;

public class Address {
    private String addLine;
    private String city;

    public Address(String addLine, String city) {
        super();
        this.addLine = addLine;
        this.city = city;
    }
    public Address() {
        super();
    }
    @Override
    public String toString() {
        return "Address [addLine=" + addLine + ", city=" + city + "]";
    }
}
