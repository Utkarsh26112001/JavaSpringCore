package tester;

import com.markets.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContextEmployee {
    public static void main (String[] args){
        ApplicationContext ac= new ClassPathXmlApplicationContext("markets_config.xml");
        Employee emp=(Employee)ac.getBean("employee" );
        System.out.println(emp);
        Employee employee1=(Employee)ac.getBean("employee1" );
        System.out.println(employee1);
        Employee employee2=(Employee)ac.getBean("employee2" );
        System.out.println(employee2);

    }
}
