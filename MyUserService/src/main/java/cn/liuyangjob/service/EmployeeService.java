package cn.liuyangjob.service;

import cn.liuyangjob.Mapper.EmployeeMapper;
import cn.liuyangjob.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/get/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeMapper.findById(id);
    }
}
