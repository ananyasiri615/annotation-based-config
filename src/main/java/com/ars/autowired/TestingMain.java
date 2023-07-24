package com.ars.autowired;

import com.ars.AppConfig;
import com.ars.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        com.ars.Employee emp = (Employee) context.getBean("emp");
        com.ars.Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println("emp : " + emp);
        System.out.println("emp1 : " + emp1);

        context.close();
    }
}
