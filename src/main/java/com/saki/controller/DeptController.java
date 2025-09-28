package com.saki.controller;

import com.saki.pojo.Dept;
import com.saki.pojo.Result;
import com.saki.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    // @RequestMapping (value = "/depts",method = RequestMethod.GET) // method: point out request ways
    @GetMapping("depts")
    public Result list(){
        System.out.println("查询全部的部门数据");
        List<Dept> deptList=deptService.findall();
        return Result.success(deptList);
    }
}
