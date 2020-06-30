package com.example.springboot003.Mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userDao {
    @Select("select username from user01 where username=#{username}")
    public String getUsername(String username);
    @Select("select password from user01 where username=#{username}")
    public String getPassword(String username);
}
