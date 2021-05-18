package com.loop;

public class runner {
		public static int num[] = new int[10];
	public static void main(String[] args) {
	
		for(int i = 0 ; i < num.length; i++) {
//			i = i+1 ;
			num[i]= i+1;
			System.out.print(num[i]+ " ");
			
		}
		System.out.println(" ");
		for (int j = 0 ; j < num.length; j++) {
			num[j] *= 10;
			System.out.print(num[j]+ " ");
		}
	}

}
