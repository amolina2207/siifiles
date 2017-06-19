package com.ak.services;

import java.util.TreeMap;

public class Test {

	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Molina",27);
		Person p2 = new Person("Perico1",254);
		Person p3 = new Person("Perico2",253);
		Person p4 = new Person("Perico3",252);
		Person p5 = new Person("Perico4",251);
		
		TreeMap<String, Person> tm = new TreeMap<String, Person>();
		
		tm.put("T", p1);
		tm.put("7", p2);
		tm.put("F", p3);
		tm.put("A", p5);
		tm.put("E", p4);
		tm.put("X", p1);
		
		System.out.println();
	}
	
}


class Person {
	private String firstName;
	private int age;
	public Person(String firstName, int age){
		this.firstName = firstName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}