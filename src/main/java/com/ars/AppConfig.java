package com.ars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    @Configuration
    @ComponentScan(basePackages = "com.ars")
    public class AppConfig {

        @Bean(name = "emp")
        Employee getEmployee() {
            return new Employee(11,"Sam",28,true);
        }

        @Bean(name = "emp1")
        Employee getEmployeeOne() {
            return new Employee(10,"Joe",25,true);
        }

    }

