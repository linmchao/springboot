package com.example.springboot003.Mapper;

import com.example.springboot003.entities.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Collection;


@Mapper
public interface DepartmentDao {

	@Select("select * from Department")
	public Collection<Department> getDepartments();

	@Select("SELECT * FROM  Department where id=#{id}")
	public  Department getDepartment(Integer id);
	
}
