package com.example.springboot003.Mapper;

import com.example.springboot003.entities.Employee;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

@Mapper
public interface EmployeeDao {


@Insert("INSERT INTO Employee(lastName,email,gender,birth,departmentId) VALUES(#{lastName},#{email},#{gender},#{birth},#{departmentId})")
	public void save(Employee employee);

	@Update("UPDATE Employee SET lastName=#{lastName},email=#{email},gender=#{gender},birth=#{birth},departmentId=#{departmentId}  where id=#{id}"

	)
	public void update(Employee employee);



	@Select("SELECT * FROM Employee")
	@Results(id = "EmployeeMap", value = {
			@Result(id = true, property = "id", column = "id"),
			@Result(property = "departmentId", column = "departmentId"),
			@Result(property = "department", column = "departmentId",
					one = @One(select = "com.example.springboot003.Mapper.DepartmentDao.getDepartment"))
	})
	public Collection<Employee> getAll();
	@Select("SELECT * FROM Employee")
	public Employee getEmployee();



	@Select("SELECT * FROM Employee where id=#{id}")
	public Employee get(Integer id);

@Delete("DELETE FROM Employee WHERE id = #{id}")
public void delete(Integer id);

}
