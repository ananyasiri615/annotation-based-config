package com.ars;

public class Doctor {
    private int id;
    private String name;
    private String department;

    public Doctor(int id, String name, String department) {
        super();
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
