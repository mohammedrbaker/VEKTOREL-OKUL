package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class ifElseMarket {
	public static void main(String[] args) {
	
		
		int myMoney;
		
		System.out.println(" I have: ");
		Scanner scan = new Scanner (System.in);
		myMoney = scan.nextInt();
		
		if (myMoney == 20) {
			System.out.println("You can bay a chocolate with your money");
			
		}
		else 
			System.out.println("You do not have enough money");
		
	}
	
}
