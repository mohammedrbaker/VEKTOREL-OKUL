package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class VergiHesaplama {
	
	public static void main(String[] args) {
		
		System.out.println("Kar miktar�n� giriniz: ");

		Scanner scan = new Scanner (System.in);
		
		int karMiktari;
		
		karMiktari = scan.nextInt();
				
		if (karMiktari >= 1000) {
			System.out.println("Y�ksek kar");
			System.out.println("Vergi dilim pay�n� girin: ");
			Scanner vergiDilimi = new Scanner (System.in); 
			int vergiYaz;
			vergiYaz =vergiDilimi.nextInt();
			System.out.println("verginiz: "+karMiktari/vergiYaz + " TL");
			
		} 	
		
		else if (karMiktari >= 500) {
			System.out.println("Y�ksek kar");
			System.out.println("Vergi dilim pay�n� girin: ");
			Scanner vergiDilimi = new Scanner (System.in); 
			int vergiYaz;
			vergiYaz =vergiDilimi.nextInt();
			System.out.println("verginiz: "+karMiktari/vergiYaz + " TL");
			
		} 	 
		else if (karMiktari >= 100) {
			System.out.println("Y�ksek kar");
			System.out.println("Vergi dilim pay�n� girin: ");
			Scanner vergiDilimi = new Scanner (System.in); 
			int vergiYaz;
			vergiYaz =vergiDilimi.nextInt();
			System.out.println("verginiz: "+karMiktari/vergiYaz + " TL");
			
		} 		
	}

}
