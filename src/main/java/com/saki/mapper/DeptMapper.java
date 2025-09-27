package com.saki.mapper;

import com.saki.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    // search all data
    @Select("select * from dept order by update_time desc;")
    List<Dept> findall();
}
