package tr.com.mohammed.part1.SwitchCaseConditions;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		System.out.print("��rencinin puan�n� giriniz: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int puan;
		puan = scanner.nextInt();
			

		switch (puan) {

		case 1: 
			System.out.println("Kald�n�z");
			break;
		case 2: 
			System.out.println("K�t�");
			break;	
		case 3: 
			System.out.println("Orta");
			break;
		case 4: 
			System.out.println("�yi");
			break;
		case 5: 
			System.out.println("Pekiyi");
			break;
		default: 
			System.out.println("Ge�ersiz not");
			break;
		
		}
	}

}
