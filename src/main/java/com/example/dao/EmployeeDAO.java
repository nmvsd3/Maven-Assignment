package com.example.dao;

import com.example.model.Employee;
import java.util.List;

public interface EmployeeDAO {
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    void updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);
}
