package com.example.kazgidro.service;

import com.example.kazgidro.entity.DbEntity;
import com.example.kazgidro.repo.dbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myService {
    @Autowired
    private dbRepo dbRepoo;

    public List<DbEntity> findAll(){
        return dbRepoo.findAll();
    }
}
