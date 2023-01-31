package com.markets.bean;

public class Employee {
    private int eId;
    private String name;
    private int salary;

    public int geteId() {
        return eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}

