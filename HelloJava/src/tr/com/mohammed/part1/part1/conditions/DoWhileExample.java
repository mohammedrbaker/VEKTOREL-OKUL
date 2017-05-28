package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		do {
			
			System.out.print(num1 + "");
			num1 --;
			
		} while (num1>=num2);
		
		
	}

}
