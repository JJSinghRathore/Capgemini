package com.cg.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

    public static void main(String[] args) {

        IEmployeeService es = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Find Employee By ID");
            System.out.println("3. View All Employees");
            System.out.println("4. Update Employee Name");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // CREATE

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter DOB (yyyy-mm-dd): ");
                    String dob = sc.nextLine();

                    String result = es.createEmployee(
                            new Employee(name, email, dob));

                    System.out.println(result);
                    break;

                // FIND BY ID
                case 2:
                    System.out.print("Enter Employee ID: ");
                    String id = sc.nextLine();

                    Employee emp = es.findById(id);

                    if (emp != null)
                        System.out.println(emp.getEmpid() + " "
                                + emp.getName() + " "
                                + emp.getEmail() + " "
                                + emp.getDob());
                    else
                        System.out.println("Employee not found");

                    break;

                // VIEW ALL
                case 3:
                    List<Employee> list = es.getAllEmployee();

                    for (Employee e : list) {
                        System.out.println(e.getEmpid() + " "
                                + e.getName() + " "
                                + e.getEmail() + " "
                                + e.getDob());
                    }
                    break;

                //  UPDATE
                case 4:
                    System.out.print("Enter Employee ID: ");
                    String uid = sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.println(
                            es.updateEmployeeName(uid, newName));
                    break;

                // DELETE
                case 5:
                    System.out.print("Enter Employee ID: ");
                    String did = sc.nextLine();

                    System.out.println(
                            es.removeEmployee(did));
                    break;

                // EXIT
                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
