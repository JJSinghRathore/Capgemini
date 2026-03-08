package StudentManagement;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args)   {
		StudentRecord sr= new StudentRecord();
		Scanner sc=new Scanner(System.in);
		try {
			for(int i=0; i<5;i++) {
				System.out.println("Enter Student ID: ");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter Student Name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter Student Course: ");
				String course=sc.nextLine();
				
				System.out.println("Enter Student marks: ");
				int marks=sc.nextInt();
				
				Student s=new Student(id, name, course, marks);
				
				sr.addStudent(s);
			} 
			sr.writeIntoFile();
			sr.readFromFile();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		sc.close();

	}

}
