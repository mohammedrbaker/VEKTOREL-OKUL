package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class ForConditions {
	public static void main(String[] args) {
		
		System.out.println("");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
//		int start=0;
//		while (start < num) {
//			System.out.println(start);
//			start++;
//		}
		
		
		int start=0;
		boolean control= true;
		while (start < num && control) {
			System.out.println(start);
			if (start == 5)
				control = false;
			start++;
		}
		
		
		int start2=0;
		boolean control2= true;
		while (start2 < num && control2) {
			System.out.println(start2);
			if (start2 == 10)
				control2 = false;
			start2++;
		}
		
		
	
	}
}
