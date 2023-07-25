package com.ars.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private int id;
    private String name;
    private int age;
    private boolean contract;

    @Autowired
    private Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isContract() {
        return contract;
    }

    public void setContract(boolean contract) {
        this.contract = contract;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Employee(int id, String name, int age, boolean contract) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.contract = contract;
    }

    public Employee() {
        super();
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", contract=" + contract + ", add=" + add
                + "]";
    }
}