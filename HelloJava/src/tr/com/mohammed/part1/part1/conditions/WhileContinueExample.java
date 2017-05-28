package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class WhileContinueExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int check =0;
		while (check < num){
			check ++;
		if (check ==3)
			continue;
		System.out.print(check +"");
		}
			
	}

}
