package com.ars;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = (Employee) context.getBean("emp");
        Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println("emp : " + emp);
        System.out.println("emp1 : " + emp1);

        context.close();
    }
}
