package com.saki.service.impl;

import com.saki.mapper.DeptMapper;
import com.saki.pojo.Dept;
import com.saki.service.DeptService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findall() {
        return deptMapper.findall();
    }

    @Override
    public void deleteId(Integer id) {
        deptMapper.deleteById(id); //返回void
    }

    @Override
    public void add(Dept dept) {
        // 1.补全基础属性
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        // 2.调用mapper
        deptMapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Override
    public void update(Dept dept) {
        // 补全基础属性
        dept.setUpdateTime(LocalDateTime.now());

        //调用mapper接口更新部门
        deptMapper.update(dept);
    }
}
