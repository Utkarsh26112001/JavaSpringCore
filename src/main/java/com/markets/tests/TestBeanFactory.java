package com.markets.tests;

import com.markets.bean.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactory {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("markets_config.xml");
        Employee employee = (Employee)factory.getBean("employee");
        System.out.println(String.valueOf(employee) + " bean factory running");
        Employee employee1 = (Employee)factory.getBean("employee1");
        System.out.println(String.valueOf(employee1) + " bean factory running");
        Employee employee2 = (Employee)factory.getBean("employee2");
        System.out.println(String.valueOf(employee2) + " bean factory running");
    }
}
///Users/utkarshtiwari/eclipse-workspace/JavaSpringCore/src/main/java/com/markets/resources/markets_configuration.xml