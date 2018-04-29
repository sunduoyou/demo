package com.example.demo.web;

import com.example.demo.entity.Area;
import com.example.demo.service.interfaces.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> modeMap = new HashMap<String,Object>();
        List<Area> list = areaService.qryArea();
        modeMap.put("areaList", list);
        return modeMap;
    }
}
