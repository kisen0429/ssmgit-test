package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有员工的信息
     */
    List<Employee>  getAllEmployee();
}
