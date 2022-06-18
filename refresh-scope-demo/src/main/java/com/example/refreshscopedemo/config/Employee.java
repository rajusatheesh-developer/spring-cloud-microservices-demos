package com.example.refreshscopedemo.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "emp")
public class Employee
{

   private String name;

}
