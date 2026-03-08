package StudentManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Student {
	
	private int studentId;
	private String studentName;
	private String course;
	private int marks;
	
	public Student(int studentId, String studentName, String course, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getCourse() {
		return course;
	}

	public int getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
	    return studentId + "," + studentName + "," + course + "," + marks;
	}
}

// interface

interface IValidate{
	public boolean isValStudentName(String studentName) throws InvalidNameException;
	public boolean isValStudentMarks(int marks) throws IllegalArgumentException;
}

//exception handling
class InvalidNameException extends Exception{
	public InvalidNameException(String msg) {
		super(msg);
	}
}

// Student Validation class
class StudentValidate implements IValidate{

	@Override
	public boolean isValStudentName(String studentName) throws InvalidNameException {
		if(studentName.matches("[a-zA-Z ]+")) {
			return true;
		}else {
			throw new InvalidNameException("Invalid name");
		}
	}

	@Override
	public boolean isValStudentMarks(int marks) throws IllegalArgumentException {
		if(marks>=0 && marks<=100) {
			return true;
		}else {
			throw new IllegalArgumentException(" Invalid marks");
		}
		
	}
	
	
}
// student record class 
class StudentRecord extends StudentValidate{
	ArrayList<Student> student = new ArrayList<>();
	
	// adding the student entry
	public void addStudent(Student s) throws IllegalArgumentException, InvalidNameException {
		if(isValStudentName(s.getStudentName()) && isValStudentMarks( s.getMarks())) {
			student.add(s);
		}
	}
	
	// writing it into a file
	public void writeIntoFile() throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("demo.txt", true));
		for(Student s: student) {
			bw.write(s.toString());
			bw.newLine();
		}
		bw.close();
		System.out.println("Student added successfully");
	}
	
	// read from a file
	public void readFromFile() throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("demo.txt"));
		System.out.println("Reading data from file...");
		String line;
		while((line=br.readLine())!=null) {
			String[] data= line.split(",");
			System.out.println(data[0]+" "+data[1]+" "+data[2]+" "+data[3]);
		}
		br.close();
	}
}





