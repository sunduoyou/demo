package com.example.demo.service.impl;

import com.example.demo.dao.AreaDao;
import com.example.demo.entity.Area;
import com.example.demo.service.interfaces.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> qryArea() {
        return areaDao.qryArea();
    }

    @Override
    public Area qryAreaById(int areaId) {
        return null;
    }

    @Transactional
    @Override
    public int insertArea(Area area) {
        return 0;
    }

    @Override
    public int updateArea(Area area) {
        return 0;
    }

    @Override
    public int deleteArea(int areaId) {
        return 0;
    }
}
