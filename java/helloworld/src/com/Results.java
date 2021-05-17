package com;

public class Results {

	public static double course(double physics, double chemistry, double biology) {	
		double total;
		total =  physics + chemistry + biology;
		return total;
	}
	public static double percent (double total, double max) {
		double percent;
		percent = total * 100 / max;
		return percent;
	}
}

