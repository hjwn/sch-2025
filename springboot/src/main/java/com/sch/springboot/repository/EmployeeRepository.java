package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {

    // 사원 객체를 저장하는 List<Employee>
    private List<Employee> list = new ArrayList<>();

    public List<Employee> selectAll(){
        return list;
    }

    public String insert(Employee employee){
        return list.add(employee) ? "success" : "fail";
    }
}
