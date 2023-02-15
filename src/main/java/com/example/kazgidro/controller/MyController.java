package com.example.kazgidro.controller;

import com.example.kazgidro.entity.DbEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private static com.example.kazgidro.service.myService myService;


    @GetMapping("/")
    public List<DbEntity> getAll(){
        return myService.findAll();
    }
}
