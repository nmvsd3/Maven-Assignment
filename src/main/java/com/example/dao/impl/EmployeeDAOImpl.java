package com.example.dao.impl;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            entityManager.remove(employee);
        }
    }
}
