package com;

public class Calculator {
	public static void main(String[] args) {
	}
	public static int add (int a, int b) {
		return a + b;
	}
	public static int subtract (int a, int b) {
		return a - b;
	}
	public static int multiply (int a, int b) {
		return a * b;
	}
	public static double divide (double a, double b) {
		if(a < b) {
			return a / b;
		}
		else {
			 System.out.println("Division cannot be performed");
			 return 0;
		}
	}
}
