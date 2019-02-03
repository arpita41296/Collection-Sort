package io.naztech.Collection_sort;

import java.time.LocalDate;
import java.util.Comparator;

public class Human implements Comparable<Human> {
int age;
String name;
int salary;
//LocalDate dateofbirth;
public Human( int age,String name, int salary) {
	super();
	this.age = age;
	this.name = name;
	this.salary = salary;
	//this.dateofbirth = dateofbirth;
}
@Override
public String toString() {
	return "Human [age=" + age + ", name=" + name + ", salary=" + salary + "]";
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}



public int compareTo(Human h) {
	if(this.salary==h.salary)
		return 0;
	else if(this.salary>h.salary)
		return 1;
	else
		return -1;
	
}


}
