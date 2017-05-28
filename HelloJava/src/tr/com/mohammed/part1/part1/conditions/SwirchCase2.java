package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class SwirchCase2 {

	public static void main(String[] args) {

		System.out.print("Lütfen gün giriniz: ");
		Scanner scan = new Scanner (System.in);
		int gun;
		gun = scan.nextInt();
		
		switch (gun){
		case 1: 
			System.out.println("P.tesi");
			
		case 2: 
			System.out.println("Salý");
			
				
		case 3: 
			System.out.println("Çarþamba");
			
					
		default: 
			System.out.println("Geçersiz gün");
			break;
			
			
			
		}
		
		

	}

}
