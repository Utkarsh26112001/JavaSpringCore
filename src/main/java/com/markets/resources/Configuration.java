package com.markets.resources;

import com.markets.bean.Address;
import com.markets.bean.Employee;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Employee createEmployee(){
        Employee employee= new Employee();
        employee.seteId(110);
        employee.setName("Jam");
        employee.setSalary(750000);
        Address address= createAddress();
        employee.setAddress(address);
        return employee;
    }
    @Bean(name = "address")
    public Address createAddress(){
        Address address= new Address();
        address.setAddressline1("Nagar Road");
        address.setAddressline2("Pune");
        return address;
    }

}
