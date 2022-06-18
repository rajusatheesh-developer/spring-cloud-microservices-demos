package com.example.refreshscopedemo.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class NonRefreshedService
{


    @Value("${a:test}")
    private String nonRefreshValue;

    public String fetchNonRefreshedValue()
    {
        log.info("RefreshedService - fetchNonRefreshedValue : "+nonRefreshValue);
        return nonRefreshValue;
    }

}
