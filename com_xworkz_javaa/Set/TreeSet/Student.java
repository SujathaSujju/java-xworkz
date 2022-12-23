package com_xworkz_javaa.Set.TreeSet;

public class Student implements Comparable<Student> {

  private String name;
  private Integer id;
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + "]";
}
@Override
public int compareTo(Student o) {
	return this.id.compareTo(o.id);
	
}


  

}
