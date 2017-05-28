package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class factorialOp {
	public static void main(String[] args) {
		
		System.out.println("Bir sayý giriniz: ");
		Scanner scanner = new Scanner (System.in);
		int factorial = scanner.nextInt();
		int start =1;
		int result=1;
		while (start<factorial) {
			
			result = start*result;
			start ++;
		}
		System.out.println("Result: " + result);
			
	}

}
