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

    public String getAddLine() {
        return addLine;
    }

    public void setAddLine(String addLine) {
        this.addLine = addLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [addLine=" + addLine + ", city=" + city + "]";
    }
}
