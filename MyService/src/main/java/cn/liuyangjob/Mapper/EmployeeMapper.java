package cn.liuyangjob.Mapper;

import cn.liuyangjob.bean.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    @Select("SELECT * FROM employees WHERE emp_no =#{id}")
    @Results(
            id="employee",
            value={
            @Result(property = "id",column = "emp_no"),
            @Result(property = "birthdate",column = "birth_date"),
            @Result(property = "firstname",column = "first_name"),
            @Result(property = "lastname",column = "last_name"),
            @Result(property = "hiredate",column = "hire_date")
            }
    )
    Employee findById(@Param("id") long id);

    @Select("SELECT * FROM employees")
    @ResultMap("employee")
    List<Employee> findAll();

}
