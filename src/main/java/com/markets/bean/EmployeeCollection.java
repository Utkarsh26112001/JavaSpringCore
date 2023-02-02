package com.markets.bean;

import java.util.List;

public class EmployeeCollection {
    private int eId;
    private String name;
    private List<String> language;

    public List<String> getLanguage() {
        return language;
    }

    public EmployeeCollection(int eId, String name, List<String> language, int salary) {
        this.eId = eId;
        this.name = name;
        this.language = language;
        this.salary = salary;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "EmployeeCollection{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", language=" + language +
                ", salary=" + salary +
                '}';
    }

    public EmployeeCollection(){
        super();
        System.out.println("In the non parametrized constructor");

    }

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


    private void init() {
        System.out.println("IN the init");
    }

    private void destroy() {
        System.out.println("In the destroy....");
    }


}

