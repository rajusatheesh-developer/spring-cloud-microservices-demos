package com.example.refreshscopedemo;

import com.example.refreshscopedemo.config.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Employee.class)
public class RefreshScopeDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(RefreshScopeDemoApplication.class, args);
    }

}
