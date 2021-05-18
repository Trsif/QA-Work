package com.string;

public class Runner {

	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		System.out.print(str2.toUpperCase()+", " +str1.toUpperCase());
		System.out.println(" ");
		System.out.println(stringCount(str2));
		System.out.println(" ");
		stringWord(str2);
		stringWordR(str2);
	}
	
	public static int stringCount(String string) {
		// Method 1 - When given a String, count and return how many words there are in that String.
		return string.length();
	}
	public static void  stringWord(String string) {
		// Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
		int count = 0 ;
		string = string + " ";
		System.out.println(string);
		System.out.println(string.length());
		for(int i = 0 ; i < string.length(); i++) {
			
			String singleChar = string.substring(i,i+1);
			if(singleChar.equals(" ")) {
				System.out.println(string.substring(i-count,i));
				count = 0;
			}else {
				count ++;
			}
		}
		}
		public static void  stringWordR(String string) {
			// Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
			int count = 0 ;
			string = string + " ";
			System.out.println(string);
			System.out.println(string.length());
			for(int i = 0 ; i < string.length(); i++) {
				
				String singleChar = string.substring(i,i+1);
				if(singleChar.equals(" ")) {
					System.out.println(string.substring(i+count,i));
					count = 0;
				}else {
					count ++;
				}
			}
//		return string.substring(0, 6);
		
	}
}
