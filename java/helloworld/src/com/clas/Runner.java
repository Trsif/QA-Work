package com.clas;

public class Runner {

	public static void main(String[] args) {
		Employee bob = new Employee("Bob");
		Trainee bobby = new Trainee("Bobby");
		bobby.addSubject("Enlgish", "Math", "Java", "SQL");
		bobby.setBursary(81000);
		double yearlySal = bob.setAnnualSalary(100000);
		double calWeekly = bob.calculateWeaklySlary(yearlySal);
		bob.setWeeklySalary(calWeekly);
		Book one = new Book("Cat In The Hat", 26, "Theodor Geisel");
		bob.read(one.title);
		System.out.println("Bobs Weekly Salary: " + bob.getWeeklySalary());
		System.out.println("Bobs Annual Salary: " + bob.getAnnualSalary());
		System.out.println("Bobby's bursary: " + bobby.getBursay());
		System.out.println("Bobby's subjected learned : " + bobby.getSubjectsLearned());
	}

}
