package com.saki.service.impl;

import com.saki.mapper.DeptMapper;
import com.saki.pojo.Dept;
import com.saki.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findall() {
        return deptMapper.findall();
    }
}
