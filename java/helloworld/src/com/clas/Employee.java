package com.clas;

public class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	private double annualSalary;
	private double weeklySalary;

	public double getAnnualSalary() {
		return annualSalary;
	}

	public double setAnnualSalary(double annualSalary) {
		return this.annualSalary = annualSalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public double setWeeklySalary(double weeklySalary) {
		return this.weeklySalary = weeklySalary;
	}

	public double calculateWeaklySlary(double annualSalary) {
		weeklySalary = annualSalary / 52;
		return weeklySalary = annualSalary / 52;
	}
}
