package com_xworkz_javaa.inheritance;

public class HasARelationshipDemo {

	public static void main(String[] args) {

	Library Sharada = new Library();

		Sharada.name = "Sharada";
		Sharada.noOfBooks = 100;
		Sharada.Location = "Bengaluru";
		Sharada.student = new Student();

		System.out.println("Library Name:" + Sharada.name);

		System.out.println("Student Name:" + Sharada.student.name);

		System.out.println("Library Name:" + Sharada.student.id);

		System.out.println("Library Name:" + Sharada.student.college);

	}
}
