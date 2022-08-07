package com.devcamp.devkurly.service;

import com.devcamp.devkurly.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDao testDao;

    @Override
    public int insertTest(String id) {
        return testDao.insertTest(id);
    }
}
