package com.example.refreshscopedemo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;


@Slf4j
@RefreshScope
@Service
public class RefreshedService
{


    @Value("${a:test}")
    private String refreshValue;

    public String fetchRefreshedValue()
    {
        log.info("RefreshedService - fetchRefreshedValue : "+refreshValue);
        return refreshValue;
    }

}
