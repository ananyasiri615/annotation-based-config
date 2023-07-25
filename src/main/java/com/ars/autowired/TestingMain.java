package com.ars.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestingMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Employee emp = (Employee) context.getBean("emp");

        System.out.println("emp : " + emp);

        context.close();
    }
}
