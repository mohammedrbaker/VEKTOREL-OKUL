package tr.com.mohammed.part1.part1.functions;

import java.util.Scanner;

public class CompititionGameFunction {

	public static void main(String[] args) {

		int skor = 0;
		int orginalDogruCevap = soruSorInt();
		int kullancicidanGelenCevap = cevapAlInt();
		if (orginalDogruCevap == kullancicidanGelenCevap) {

			skor += 5;
		}

		String orginalDogruCevapString = soruSorString();
		String kullancicidanGelenCevapString = cevapAlString();
		if (orginalDogruCevapString.equalsIgnoreCase(kullancicidanGelenCevapString)) {
			skor += 10;

		}

		int orginalIkinciSorununCevabi = soruSorIki();
		int kullanicidenGelenIkinciSorununCevabi = cevapAlIntIki();
		if (orginalIkinciSorununCevabi == kullanicidenGelenIkinciSorununCevabi) {
			skor += 5;

		}

		System.out.println("Skorunuz: " + skor);

	}

	public static int cevapAlIntIki() {
		Scanner scan = new Scanner(System.in);

		return scan.nextInt();
	}

	public static int soruSorIki() {

		System.out.println("5*4 ne kadar ?");

		return 20;
	}

	public static String cevapAlString() {
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

	private static String soruSorString() {
		System.out.println("Türkiye'nin baþkenti nedir? ");

		return "Ankara";
	}

	public static int cevapAlInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();

	}

	public static int soruSorInt() {

		int veri = 5;
		System.out.println(veri + " karesi nedir ?");
		int sonuc = (int) Math.pow(veri, 2);

		return sonuc;
	}

}
