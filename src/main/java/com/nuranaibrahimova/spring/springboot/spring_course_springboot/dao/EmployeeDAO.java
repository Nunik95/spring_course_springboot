/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nuranaibrahimova.spring.springboot.spring_course_springboot.dao;

import java.util.List;
import com.nuranaibrahimova.spring.springboot.spring_course_springboot.entity.Employee;

/**
 *
 * @author user
 */
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee emp);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
