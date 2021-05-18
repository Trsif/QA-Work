package com.loop;

public class runner {
		public static int num[] = {1,2,3,4,5,6,7,8,9,10};
	public static void main(String[] args) {
	
		for(int i = 0 ; i < num.length; i++) {
//			i = i+1 ;
			System.out.println(num[i]);
			
		}
		for (int j = 0 ; j < num.length; j++) {
			System.out.println(num[j] * 10);
		}
	}

}
