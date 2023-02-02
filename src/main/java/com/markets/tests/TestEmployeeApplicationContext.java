package com.markets.tests;

import com.markets.bean.Address;
import com.markets.bean.Employee;
import com.markets.bean.EmployeeCollection;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeApplicationContext {
    public static void main(String[] args) {
       //ApplicationContext ac = new ClassPathXmlApplicationContext("markets_config.xml");
        ConfigurableApplicationContext ac= new ClassPathXmlApplicationContext("markets_config.xml");
        Employee emp = (Employee)ac.getBean("employee");
        System.out.println(emp);
        Employee employee1 = (Employee)ac.getBean("employee1");
        System.out.println(employee1);
        Employee employee2 = (Employee)ac.getBean("employee2");
        System.out.println(employee2);
        Employee employee3 = (Employee)ac.getBean("employee3");
        Address address = (Address) ac.getBean("address");
        System.out.println(address);
        System.out. println(employee3);
        Employee employee4=(Employee)ac.getBean("employee4");
        Address address1= employee4.getAddress();
        System.out.println(employee4);
        System.out.println(address1);
        EmployeeCollection ep=(EmployeeCollection) ac.getBean("empObject");
        System.out.println(ep);

        //ac.close();
    }
}
