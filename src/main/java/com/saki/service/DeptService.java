package com.saki.service;

import com.saki.pojo.Dept;

import java.util.List;

public interface DeptService {

    // search all data
    List<Dept> findall();

    // 根据id删除部门
    void deleteId(Integer id);

    // add department
    void add(Dept dept);

    // search department
    Dept getById(Integer id);

    // override department
    void update(Dept dept);
}
