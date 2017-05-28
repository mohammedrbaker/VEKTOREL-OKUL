package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int myNumber = scanner.nextInt();
		for (int control = myNumber; 0 < control; control --) {
			if (control%2==1) {
				System.out.print(control + " ");

			}
		}
		System.out.println();
		
		for (int control = 0; myNumber > control; control ++) {
				if (control%2==1) {
					System.out.print(control + " ");

				}
		}
			
	}

}
