package com.cg.service;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

import java.util.List;

public class EmployeeService implements IEmployeeService{
    IEmployeeDao dao=new EmployeeDao();

    @Override
    public String createEmployee(Employee emp) {
        if(emp.getName()==null || emp.getEmail()==null){
            return "Invalid employee datails...";
        }
        return dao.saveEmployee( emp);

    }

    @Override
    public Employee findById(String eid) {
        return dao.findEmployee(eid);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return dao.getAll();
    }

    @Override
    public String updateEmployeeName(Employee emp) {
        if(emp.getEmpid()==null ){
            return "Employee Id is required...";
        }
        if(emp.getName()==null && emp.getEmail()==null && emp.getDob()==null){
            return "Require valid details...";
        }
        return dao.updateEmployee(emp);
    }

    @Override
    public String removeEmployee(String empid) {
        if(empid==null || empid.isEmpty()){
            return "Invalid employee";
        }
        return dao.removeEmployee( empid);
    }
}
