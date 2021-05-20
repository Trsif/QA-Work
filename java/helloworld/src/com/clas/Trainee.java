package com.clas;

import java.util.ArrayList;

public class Trainee extends Person {
	private double bursary;
	private ArrayList<String> subjectsLearned = new ArrayList<>();

	public Trainee(String name) {
		super(name);

	}

	public Trainee(String name, double bursary, ArrayList<String> subjectsLearned) {
		super(name);
		this.bursary = bursary;
		this.subjectsLearned = subjectsLearned;
	}

	public double setBursary(double bursary) {
		return this.bursary = bursary;
	}

	public double getBursay() {
		return bursary;
	}

	public ArrayList<String> setSubjectLearned(ArrayList<String> subjectsLearned) {
		return this.subjectsLearned = subjectsLearned;
	}

	public ArrayList<String> getSubjectsLearned() {
		return subjectsLearned;
	}

	public void addSubject(String... subject) {
		for (String i : subject) {
			subjectsLearned.add(i);
		}
	}
}
