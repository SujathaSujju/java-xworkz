package com_xworkz_javaa.Set.TreeSet;

import java.util.TreeSet;

public class StudentSet {
 public static void main(String args[]) {
	 
	 Student sujatha = new Student();
	 sujatha.setId(11);
	 sujatha.setName("sujatha");
	 
	 Student poori = new Student();
	 poori.setId(12);
	 poori.setName("poori");
	 
	 Student siri = new Student();
	 siri.setId(13);
	 siri.setName("siri");
	 
	 TreeSet<Student> students = new TreeSet<>(new StudentComparator());
	 
	 students.add(sujatha);
	 students.add(poori);
	 students.add(siri);
	 
	 System.out.println(students);
 }
}
