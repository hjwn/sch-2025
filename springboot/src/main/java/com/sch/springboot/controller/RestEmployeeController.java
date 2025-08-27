package com.sch.springboot.controller;

import com.sch.springboot.dto.Employee;
import com.sch.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React 개발 서버 주소
public class RestEmployeeController {

    EmployeeService employeeService;

    // 생성자를 이용한 Loose Coupling DI
    @Autowired
    public RestEmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //React --> 사원 등록
    @PostMapping("/employees/register")
    public String employeeRegister(@RequestBody Employee employee){
        return employeeService.register(employee);
    }

    //React --> 사원 리스트
    @GetMapping("/employees")
    public List<Employee> employees(){
        return employeeService.findAll();
    }

    @PostMapping("/register")
    public String register(Employee employee){
        return employeeService.register(employee);      // success or fail
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Employee> list = employeeService.findAll();
        model.addAttribute("list",list);
        return "employeeList";
    }

}
