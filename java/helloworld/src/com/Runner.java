package com;
public class Runner {
	public static void main(String[] args) {
		double total;
		double scores[] = {120,150,150};

		total = Results.course(scores[0],scores[1],scores[2]);
		System.out.println("Your total scores for each test was " + total);
		for(double i : scores ) {
			double x;
			x = Results.percent(i, 150);
			System.out.println( x + " %"  );
			if(Results.percent(total, 450 ) <= 60 && x <= 60)  {
				System.out.println("You scored an "+ String.format("%.2f",Results.percent(total, 450))+" you failed");
			}
			else {
				System.out.println("You scored an "+ String.format("%.2f",Results.percent(total, 450))+" you pass");
			}
		
			
		}
		
//		if(Results.percent(total, 450) <= 60) {
//			System.out.println("You scored an "+ String.format("%.2f",Results.percent(total, 450))+" you failed");
//		}else {
//			System.out.println("You scored an "+ String.format("%.2f",Results.percent(total, 450))+" you pass");
//		}
//		System.out.println("Your percent was " + String.format("%.2f",Results.percent(total, 450)) + "%" );
		
//		System.out.println("dividing  your giving number " + Calculator.divide(7,5) );
	}
}
  