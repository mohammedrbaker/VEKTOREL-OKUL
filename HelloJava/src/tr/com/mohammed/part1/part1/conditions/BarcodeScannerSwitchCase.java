package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class BarcodeScannerSwitchCase {
	
		
	public static void main(String[] args) {
	
		System.out.println("Barcode girin ve ard�ndan y�l girin: ");
		
		Scanner scan = new Scanner (System.in);
		String barcode= scan.nextLine();
		int yil = scan.nextInt();
		
		switch (barcode.toLowerCase() + "-"+ yil) {
		case "java19-2016":
			
			System.out.println("java19-2016 kursu bitti");
			
			break;
			
		case "java20-2017":
			
			System.out.println("java20-2017 kursu a��ld� ");
			
			break;
			
		case "java21-2018":
	
			System.out.println("A��lmad�");
	
			break;

		default: 
			System.out.println("Ge�ersiz giri�!");
			break;
		}
	}

}
