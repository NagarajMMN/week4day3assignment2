package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("NAGARAJ.M");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void studentId() {
		System.out.println("921917104023");
	}
	public static void main(String[] args) {
		Student obj3=new Student();
		obj3.studentDept();
		obj3.studentId();
		obj3.studentName();
		
		Department objj=new Department();
		objj.deptName();
		
		College obj=new College();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
	}
	
}
