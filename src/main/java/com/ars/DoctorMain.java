package com.ars;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DoctorMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigDoctor.class);

        Doctor doc1 = (Doctor) context.getBean("doc1");
        Doctor doc2 = (Doctor) context.getBean("doc2");

        System.out.println("doc1 : " + doc1);
        System.out.println("doc2 : " + doc2);

        context.close();
    }
}
