/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nuranaibrahimova.spring.springboot.spring_course_springboot.dao;

import com.nuranaibrahimova.spring.springboot.spring_course_springboot.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

//import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.hibernate.query.Query;

import javax.transaction.Transactional;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
//        Session session = entityManager.unwrap(Session.class);
//
//Query <Employee> query=session.createQuery("from Employee", Employee.class);
//List<Employee> allEmployees=query.getResultList();
        Query query = entityManager.createQuery("from Employee");
        List<Employee> allEmployees = query.getResultList();
        return allEmployees;
    }

    public void saveEmployee(Employee emp) {
//         Session session = entityManager.unwrap(Session.class);
//session.saveOrUpdate(emp);
        Employee newEmp=entityManager.merge(emp);
emp.setId(newEmp.getId());
    }

    public Employee getEmployee(int id) {
//         Session session = entityManager.unwrap(Session.class);
//         Employee employee=session.get(Employee.class, id);
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    public void deleteEmployee(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Employee> query = session.createQuery("delete from Employee "
//                + "where id=:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
        Query query = entityManager.createQuery("delete from Employee "
                + "where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();

    }
}
