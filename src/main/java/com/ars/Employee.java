package com.ars;

public class Employee {
    private int id;
    private String name;
    private int age;
    private boolean contract;

    public Employee(int id, String name, int age, boolean contract) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.contract = contract;
    }
    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", contract=" + contract + "]";
    }
}
