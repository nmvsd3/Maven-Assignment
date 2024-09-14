package com.example.service;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public void addEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    public Employee getEmployee(Long id) {
        return employeeDAO.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    public void deleteEmployee(Long id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
