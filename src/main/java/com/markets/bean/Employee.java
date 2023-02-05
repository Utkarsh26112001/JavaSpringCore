package com.markets.bean;

public class Employee {
    private int eId;
    private String name;
    private Address address;

    public Employee( Address address, int eId, String name, int salary) {
        super();
        System.out.println("In the parametrized constructor");
        this.eId = eId;
        this.name = name;
        this.salary = salary;
        this.address=address;
    }
    public Employee(){
        super();
        System.out.println("In the non parametrized constructor");

    }

    private int salary;

    public Employee(Address address) {
     this.address= address;
        System.out.println("IN the inner bean address");
    }

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
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }

    private void init() {
        System.out.println("IN the init");
    }

    private void destroy() {
        System.out.println("In the destroy....");
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
    }
}

