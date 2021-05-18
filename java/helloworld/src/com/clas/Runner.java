package com.clas;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person bob = new Person("Bob", 29, "Male");
		Book one = new Book("Cat In The Hat", 26, "Theodor Geisel");
		bob.read(one.title);
	}

}
