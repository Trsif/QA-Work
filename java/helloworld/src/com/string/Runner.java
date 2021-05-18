package com.string;

public class Runner {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		System.out.print(str2.toUpperCase()+", " +str1.toUpperCase());
		System.out.println(" ");
		System.out.println(stringCount(str2));
	}
	
	public static int stringCount(String string) {
		return string.length();
	}
	public static void stringWord(String string) {
		
	}
}
