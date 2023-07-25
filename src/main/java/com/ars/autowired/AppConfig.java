package com.ars.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ars")
public class AppConfig {

    @Bean(name = "emp")
    Employee getEmployee() {
        return new Employee();
    }

    @Bean(name = "emp1")
    Employee getEmployeeOne() {
        return new Employee(10,"Joe",25,true);
    }

    @Bean(name = "add")
    Address getAddress() {
        return new Address("Street No 1","London");
    }

}