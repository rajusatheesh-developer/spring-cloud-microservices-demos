package com.example.refreshscopedemo.service;


import com.example.refreshscopedemo.config.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ConfigRefreshedService
{



    @Autowired
    private Employee employee;

    public String fetchConfigRefreshedValue()
    {
        log.info("RefreshedService - fetchNonRefreshedValue : "+employee.getName());
        return employee.getName();
    }

}
