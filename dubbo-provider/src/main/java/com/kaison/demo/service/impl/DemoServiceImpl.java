package com.kaison.demo.service.impl;

import com.kaison.demo.service.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * User: kaison
 * Date: 2018/4/19
 * Time: 15:17
 * Description:
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
