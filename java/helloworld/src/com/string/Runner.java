package com.string;

public class Runner {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining like Sheeesh";
		String str2 = "today it is sunny";
		System.out.print(str2.toUpperCase() + ", " + str1.toUpperCase());
		System.out.println(" ");
		System.out.println(stringCount(str1));
		System.out.println(" ");
		stringWord(str1);
		stringWordR(str2);
	}

	public static int stringCount(String string) {
		string = string + " ";
		int words = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equals("\s")) {
				words++;
			}
		}
		return words;
	}

	public static void stringWord(String string) {
		// Method 2 - When given a String, print out this String in a vertical fashion,
		// each word on a different line.
		int count = 0;
		string = string + " ";
		for (int i = 0; i < string.length(); i++) {

			String singleChar = string.substring(i, i + 1);
			if (singleChar.equals(" ")) {
				System.out.println(string.substring(i - count, i));
				count = 0;
			} else {
				count++;
			}
		}
	}

	public static void stringWordR(String string) {
		int count = 0;
		string = " " + string;
		for (int i = string.length(); i > 0; i--) {
			String singleChar = string.substring(i - 1, i);
			if (singleChar.equals(" ")) {
				System.out.println(string.substring(i, i + count));
				count = 0;
			} else {
				count++;
			}
		}
	}
}
