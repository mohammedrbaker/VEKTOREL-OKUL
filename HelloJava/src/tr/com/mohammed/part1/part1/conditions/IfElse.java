package tr.com.mohammed.part1.part1.conditions;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
//		String mustafaninSecimi = null;
//		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Bugün ne giysem ? ");
//		
//		mustafaninSecimi = scan.nextLine();
//		
//				
//		if (mustafaninSecimi.equals("siyah")) {
//			System.out.println("Giyeceðim");
//			}
//		if (mustafaninSecimi.equals("beyaz")) {
//			System.out.println("Giyeceðim");
//			}
				
		//////////////////////
		
		//String annemEvdeOlmaDurumu = null;
//		boolean annemEvde;
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Annem Evde mi? ");
//		
//		annemEvde = scan.nextBoolean();
//		
//		
//		if (!annemEvde) {
//			
//			System.out.println("Annem evde deðildir.");
//			
//		}else{
//			System.out.println("Annem evdedir.");
//		}
				
		
		/////////////////////
		
//		if (annemEvdeOlmaDurumu.equals("siyah")) {
//			System.out.println("Giyeceðim");
//			}
//		if (annemEvdeOlmaDurumu.equals("beyaz")) {
//			System.out.println("Giyeceðim");
//			}
		
		
		///////////////
		
		
		
		String kontrolDurumu;
		Scanner scan = new Scanner (System.in);
		System.out.println("Annem Evde mi? ");
		
		
		kontrolDurumu = scan.nextLine();
		
		
		if (kontrolDurumu.equalsIgnoreCase("hayir")) {
			
			System.out.println("Annem evde deðildir.");
			
		}else{
			System.out.println("Annem evdedir.");
		}
		
	}

}
