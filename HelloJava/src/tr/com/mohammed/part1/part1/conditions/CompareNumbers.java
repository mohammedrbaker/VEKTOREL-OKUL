package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {
		int y,max=1,min = 888888888;
				
		Scanner scanner = new Scanner (System.in);
		
		
		for (;;){
			
			
			y=scanner.nextInt();
			
			if (y==0)
				break;
			
			if (max < y)
				max =y;
			if (min > y)
				min =y;
			
		}
		System.out.println(max);		
		System.out.println(min);	
		
//		int y,min=100000;
//		
//		
//		for (;;){
//			Scanner scanner = new Scanner (System.in);
//			y=scanner.nextInt();
//			if (min > y)
//				min =y;
//			
//			if (scanner.nextInt()==0)
//				break;
//		}
//		System.out.println(min);			
		
		
		
		}
	}
	

		
		