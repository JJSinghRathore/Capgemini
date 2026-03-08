package com.cg.dao;

import com.cg.bean.Employee;

import java.util.List;

public interface IEmployeeDao {
    public String saveEmployee(Employee emp);
    public String removeEmployee(String empid);
    public Employee findEmployee(String empid);
    public List<Employee> getAll();
    public String updateEmployee(Employee emp);
}
