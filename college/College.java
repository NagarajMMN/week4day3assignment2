package org.college;

public class College {
		
	public void collegeName() {
		System.out.println("SSCET,PALANI");
	}
	public void collegeCode() {
		System.out.println("921917");
	}
	public void collegeRank() {
		System.out.println("first class");
		
	}
	public static void main(String[] args) {
		College obj=new College();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		
	}
}
