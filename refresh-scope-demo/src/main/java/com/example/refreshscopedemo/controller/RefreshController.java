package com.example.refreshscopedemo.controller;


import com.example.refreshscopedemo.service.ConfigRefreshedService;
import com.example.refreshscopedemo.service.NonRefreshedService;
import com.example.refreshscopedemo.service.RefreshedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/refresh")
public class RefreshController
{

    @Autowired
    private RefreshedService refreshedService;
    @Autowired
    private NonRefreshedService nonRefreshedService;
    @Autowired
    private ConfigRefreshedService configRefreshedService;

    @GetMapping(value = "/refreshed")
    public String getRefreshValue()
    {
        return refreshedService.fetchRefreshedValue();
    }

    @GetMapping(value = "/nonrefreshed")
    public String getNonRefreshValue()
    {
        return nonRefreshedService.fetchNonRefreshedValue();
    }

    @GetMapping(value = "/configprop")
    public String getConfigRefreshValue()
    {
        return configRefreshedService.fetchConfigRefreshedValue();
    }

}
