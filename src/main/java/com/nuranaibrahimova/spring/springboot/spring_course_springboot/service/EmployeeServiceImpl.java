/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nuranaibrahimova.spring.springboot.spring_course_springboot.service;

import com.nuranaibrahimova.spring.springboot.spring_course_springboot.dao.EmployeeDAO;
import com.nuranaibrahimova.spring.springboot.spring_course_springboot.entity.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author user
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
       return employeeDAO.getAllEmployees();
        
    }
     @Transactional
    public void saveEmployee(Employee emp) {
         employeeDAO.saveEmployee(emp);
    }
     @Transactional
     public Employee getEmployee(int id) {
         return employeeDAO.getEmployee(id);
     }
      @Transactional
     public void deleteEmployee(int id){
      employeeDAO.deleteEmployee(id);
}
}
