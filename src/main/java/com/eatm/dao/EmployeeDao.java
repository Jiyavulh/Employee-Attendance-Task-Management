package com.eatm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eatm.entity.Employee;
@Component
public class EmployeeDao {

    @Autowired
    EntityManager entityManager;

    @Autowired
    EntityTransaction entityTransaction;


    public Employee saveEmployee(Employee employee) {

        entityTransaction.begin();
        entityManager.persist(employee);
        entityTransaction.commit();

        return employee;
    }


    public Employee updateEmployee(Employee employee) {

        entityTransaction.begin();
        entityManager.merge(employee);  
        entityTransaction.commit();

        return employee;
    }

 
    public Employee deleteEmployee(Employee employee) {

        entityTransaction.begin();
        entityManager.remove(employee);
        entityTransaction.commit();

        return employee;
    }

  
    public Employee findEmployeeById(int employeeId) {

        return entityManager.find(Employee.class, employeeId);
    }


    public List<Employee> findAllEmployees() {

        Query query =
                entityManager.createQuery("select e from Employee e");

        return query.getResultList();
    }


    public Employee findEmployeeByEmailAndPassword(
            String email,
            String password) {

        Query query =
                entityManager.createQuery(
                    "select e from Employee e where e.email=?1 and e.password=?2"
                );

        query.setParameter(1, email);
        query.setParameter(2, password);

        List<Employee> list = query.getResultList();

        return list.size() > 0 ? list.get(0) : null;
    }


    public Employee findEmployeeByEmail(String email) {

        Query query =
                entityManager.createQuery(
                    "select e from Employee e where e.email=?1"
                );

        query.setParameter(1, email);

        List<Employee> list = query.getResultList();

        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Employee> findAllDevelopers() {

        Query query =
                entityManager.createQuery(
                    "select e from Employee e where e.role='developer'"
                );

        return query.getResultList();
    }
}
