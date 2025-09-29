package com.saki.mapper;

import com.saki.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    // 结果封装
    /* @Result({
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime"),
    })
     */

    // search all data
    @Select("select id,name,create_time, update_time from dept order by update_time desc;")
    // 起别名 create_time createTime, update_time updateTime
    List<Dept> findall();
}
