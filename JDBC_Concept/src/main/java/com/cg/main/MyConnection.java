//package com.cg.main;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//
//public class MyConnection {
//
//    public static void main(String[] args) {
//
//        try {
//            // Load driver (optional in new JDBC)
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Create connection
//            Connection con =
//                    DriverManager.getConnection(
//                            "jdbc:mysql://localhost:3306/mydb",
//                            "root",
//                            "karuna2984"
//                    );
//
//
//            stat.executeQuery("select * from customers");
//            System.out.println("Connected.....");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
package com.cg.main;

import java.sql.*;
import java.util.Scanner;

public class MyConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =
                            DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/mydb",
                            "root",
                            "karuna2984"
                    );
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery("select * from customers");
//            while (rs.next()){
//                System.out.println(rs.getString("ename")+ "\t" + rs.getString("job") + "\t"+ rs.getDate(5));
//            }

            // Using emp id to access the row of the table
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter emp id");
//            int eid = sc.nextInt();
//            PreparedStatement ps= con.prepareStatement("select * from emp where empno=?");
//            ps.setString(1, eid);

//            // Using column labels to access rows
//            PreparedStatement ps= con.prepareStatement("select * from emp where ENAME =? and job=?");
//            ps.setString(1, "Smith");
//            ps.setString(2, "CLERK");
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                System.out.println(rs.getString("ename")+ "\t" + rs.getString("job") + "\t"+ rs.getDate(5));
//            }
//            else {
//                System.out.println("eid not found");
//            }

//            insert the new entry

            PreparedStatement ps = con.prepareStatement("insert into customers values (?,?,?,?,?)");
            ps.setInt(1, 16);
            ps.setString(2, "Aadya");
            ps.setString(3, "1234567890");
            ps.setString(4, "2026-02-25");
            ps.setInt(5, 1200);


//            Delete row from the table

            PreparedStatement ps2 = con.prepareStatement("delete from customers where id=?");
            ps2.setInt(1, 16);

//             Update data in the table

            PreparedStatement ps1 = con.prepareStatement("update customers set name = ? where phone=?");
            ps1.setString(1, "RAM");
            ps1.setString(2, "9876543210");


            int rows=ps2.executeUpdate();

            if(rows>0)
                System.out.println("customer created successfully");

        } catch(ClassNotFoundException | SQLException e){
            System.out.println("not created");
        }
    }
}