package com.clas;

public class Person {
	public String name;
	public int age;
	public String gender;
	public boolean isBreathing;
	public int walkSpeed = 30;

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public void read(String book) {
		System.out.println(this.name + " is reading the book titled: " + book);
	}

	public boolean isStillBreathing() {
		return isBreathing;
	}

	public String speak(String msg) {
		return this.name + " says: " + msg;
	}

	public int walk() {
		return walkSpeed;
	}
}
