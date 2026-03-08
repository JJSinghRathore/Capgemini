package com.cg.service;

import com.cg.bean.Employee;

import java.util.List;

public interface IEmployeeService {
    public String createEmployee(Employee emp);
    public Employee findById(String eid);
    public List<Employee> getAllEmployee();
    public String updateEmployeeName(Employee emp);
    public String removeEmployee(String empid);
}
