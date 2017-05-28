package tr.com.mohammed.part3.object2.ulasim;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) {
		// Object yolcuSayisiSoyle;
//		System.out.print("Yolcu sayýsý gir: ");
//		Scanner scanner = new Scanner(System.in);
		Object otobus = new Otobus();
		Object min = new Minibus();
//		Object yolcuSayisiSoyle = scanner.nextInt();
		yolcuSayisi(otobus);
		yolcuSayisi(min);

	}

	private static void yolcuSayisi(Object obj) {

		if (obj instanceof Otobus) {

			Otobus oto = (Otobus)obj;
			int veri = oto.getYolcuSayisi();
			
			System.out.println("otobus Yolcu Sayisi: "+veri);

		}
		if (obj instanceof Minibus) {
			System.out.println("minibus Yolcu Sayisi: "+((Minibus)obj).getYolcuSayisi());
		}

	}

}
