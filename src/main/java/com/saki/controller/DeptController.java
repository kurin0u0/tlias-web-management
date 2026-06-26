package com.saki.controller;

import com.saki.pojo.Dept;
import com.saki.pojo.Result;
import com.saki.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/depts") // 抽取公共路径
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;
    // @RequestMapping (value = "/depts",method = RequestMethod.GET) // method: point out request ways
    @GetMapping
    public Result list(){
        System.out.println("查询全部的部门数据");
        List<Dept> deptList=deptService.findall();
        return Result.success(deptList);
    }

    @DeleteMapping
    public Result delete(Integer id){ //请求参数与形参变量名相同，直接收，@RequestParam用了话参数必须传递
        System.out.println("根据id删除部门 " + id);
        deptService.deleteId(id);
        return Result.success();
    }

    //添加部门
    @PostMapping
    public Result add(@RequestBody Dept dept){
        System.out.println("新增部门" + dept);
        deptService.add(dept);
        return Result.success();
    }

    //查询部门
    @GetMapping("/{id}")
    public Result getInfo(@PathVariable Integer id){
        System.out.println("根据ID查询部门: " + id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    // override department
    @PutMapping
    public Result update(@RequestBody Dept dept){
        System.out.println("修改部门: " + dept);
        deptService.update(dept);
        return Result.success();
    }
}
