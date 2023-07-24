package com.ars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ars")
public class AppConfigDoctor {

    @Bean(name = "doc1")
    Doctor getDoctorOne() {
        return new Doctor(11,"Sam","Cardiology");
    }

    @Bean(name = "doc2")
    Doctor getDoctorTwo() {
        return new Doctor(10,"Joe","Dental");
    }

}
