package com.devcamp.devkurly.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    private SqlSession session;
    private static String namespace = "com.devcamp.eztour.testMapper.";

    @Override
    public int insertTest(String id) {
        return session.insert(namespace+"insertTest",id);
    }
}
