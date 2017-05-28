package tr.com.mohammed.part1.array;

import java.util.Scanner;

public class CharDiziOkuma {
	
	public static void main(String[] args) {
		
		
		double doubleDizi[] = doubleDiziOlulustur ();
		String stringDizi = stringDiziDonustur(doubleDizi);
		
		System.out.println(stringDizi);
		
		
		
	}

	private static double[] doubleDiziOlulustur() {
		Scanner scanner = new Scanner (System.in);
		double[] doubleDizi = new double [5];
		for (int i = 0; i < doubleDizi.length; i++) {
			double doubleOku = scanner.nextDouble();
			doubleDizi [i]= doubleOku;
		}
		return doubleDizi;
		
				
	}

	public static String stringDiziDonustur(double[] doubleDizi) {
		
		String stringDizi ="";
		for (int i = 0; i < doubleDizi.length; i++) {
			stringDizi = stringDizi + doubleDizi[i] + " - ";
			
		}
		
		return stringDizi;
		
		
		


		
		
	}

}
