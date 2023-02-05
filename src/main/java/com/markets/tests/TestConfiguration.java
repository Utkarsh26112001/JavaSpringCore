package com.markets.tests;

import com.markets.resources.Configuration;

public class TestConfiguration {
    public static void main(String[] args){
        Configuration configuration= new Configuration();
        System.out.println(configuration.createEmployee());
        System.out.println(configuration.createAddress());
    }
}
