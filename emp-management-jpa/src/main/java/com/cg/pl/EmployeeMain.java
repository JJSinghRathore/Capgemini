package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
    static void main(String[] args) {
        IEmployeeService es= new EmployeeService();
        Scanner sc= new Scanner(System.in);

        while(true){
            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Find Employee By ID");
            System.out.println("3. View All Employees");
            System.out.println("4. Update Employee Name");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter Empid: ");
                    String empid=sc.nextLine();
                    System.out.println("Enter name: ");
                    String name=sc.nextLine();
                    System.out.println("Enter email: ");
                    String email=sc.nextLine();
                    System.out.println("Enter DOB(yyyy-mm-dd): ");
                    String dob=sc.nextLine();
                    Employee emp=new Employee(empid,name,email,dob);
                    System.out.println(es.createEmployee(emp));
                    break;
                case 2:
                    System.out.println("Enter Employee id: ");
                    String empId=sc.nextLine();
                    if(empId!=null){
                        System.out.println(es.findById(empId));
                    }else{
                        System.out.println("Employee id is not valid");
                    }
                    break;
                case 3:
                    List<Employee> li=es.getAllEmployee();
                    if(li!=null){
                        li.forEach(System.out::println);
                    }else{
                        System.out.println("No Employee found!");
                    }
                    break;
                case 4:
                    Employee e=new Employee();
                    System.out.println("Enter the Employee id to update its entries: ");
                    e.setEmpid(sc.nextLine());
                    System.out.println("What do you want to update: ");
                    System.out.println("1. Name");
                    System.out.println("2. Email");
                    System.out.println("3. DOB");

                    int ch=sc.nextInt();
                    switch(ch){
                        case 1:
                            System.out.println("Enter new name: ");
                            e.setName(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Enter new Email: ");
                            e.setEmail(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter new DOB: ");
                            e.setDob(sc.nextLine());
                            break;
                        default:
                            System.out.println("Invalid Choice");
                        return;
                    }
                    System.out.println(es.updateEmployeeName(e));
                    break;
                case 5:
                    System.out.println("Enter the Id of the Employee: ");
                    String delId=sc.nextLine();
                    if(delId!=null){
                        System.out.println(es.removeEmployee(delId));
                    }else{
                        System.out.println("Invalid ");
                    }
                    break;
                case 6:
                    System.out.println("Thank you!!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

}
