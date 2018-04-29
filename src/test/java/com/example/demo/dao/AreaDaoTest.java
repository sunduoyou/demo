package com.example.demo.dao;

import com.example.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;
    @Test
    public void qryArea() throws Exception {
        List<Area> list = areaDao.qryArea();
        System.out.println(list.size());
    }

    @Test
    @Ignore
    public void qryAreaById() throws Exception {
    }

    @Test
    @Ignore
    public void insertArea() throws Exception {
    }

    @Test
    @Ignore
    public void updateArea() throws Exception {
    }

}