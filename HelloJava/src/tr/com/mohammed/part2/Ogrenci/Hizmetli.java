package tr.com.mohammed.part2.Ogrenci;

import java.util.Scanner;

public class Hizmetli {
	int hizmetliId;
	String hizmetliIsim = "Ahmet";
	
	String gelenVeri;

	// void isimYazdir();

	void isimYazdir() {

//		System.out.println("Hizmetli ID: " + hizmetliId);
//		System.out.println("Hizmetli �simi: " + hizmetliIsim);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hizmetli isim girin: ");
				
		String hizmetliIsimGir= scanner.nextLine();
		
		System.out.print("Hizmetli ID girin: ");
		
		int hizmetliIdGir= scanner.nextInt();
		
		System.out.println("Hizmetli ID: " + hizmetliIdGir);
		System.out.println("Hizmetli �simi: " + hizmetliIsimGir);
		System.out.println("--------------------------");
	}
	
	String veriGirPass () { 
		
		String veriGirPassa = "hizmet�i ismi burada : " + hizmetliIsim;
			
		return veriGirPassa;
		
	}


}
