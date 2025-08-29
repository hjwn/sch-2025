package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;

import java.util.List;

public interface EmployeeRepositoryInterface {

    public List<Employee> selectAll();
    public int insert(Employee employee);
}
