/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nuranaibrahimova.spring.springboot.spring_course_springboot.controller;

import com.nuranaibrahimova.spring.springboot.spring_course_springboot.entity.Employee;
import com.nuranaibrahimova.spring.springboot.spring_course_springboot.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class MyRESTController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List <Employee> showAllEmployees() {
        List <Employee> allEmployees=employeeService.getAllEmployees();
        return allEmployees;
 }
     @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee=employeeService.getEmployee(id);
        
        return employee;
        
    }
    
  
          
            @PostMapping("/employees")
            public Employee addNewEmployee(@RequestBody Employee employee){
                employeeService.saveEmployee(employee);
                return employee;
                
            }
             @PutMapping("/employees")
            public Employee updateEmployee(@RequestBody Employee employee){
                
                employeeService.saveEmployee(employee);
                return employee;
                
            }
            @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee=employeeService.getEmployee(id);
        employeeService.deleteEmployee(id);
        
        return "Employee with an ID "+id+" was successfully deleted.";
        
    }
}
