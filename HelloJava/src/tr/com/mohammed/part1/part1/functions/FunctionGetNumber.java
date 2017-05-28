package tr.com.mohammed.part1.part1.functions;

import java.util.Scanner;

public class FunctionGetNumber {

	public static void main(String[] args) {

		int sayi = veriAlFonkisyonu();
		yonlendirici(sayi);
		System.out.println("veriAlFonkisyonu ve yonlendirici çaðýrýldý ve bitti");

	}

	public static int veriAlFonkisyonu() {

		Scanner scan = new Scanner(System.in);
		int sayiDon = scan.nextInt();
		return sayiDon;

	}

	public static void yonlendirici(int yeniSayi) {
		if (tekMI(yeniSayi)) {
			System.out.println("tek");
		}

		else if (ciftMI(yeniSayi)) {
			System.out.println("çift");
		}

	}

	public static boolean ciftMI(int yeniSayi) {
		if (yeniSayi % 2 == 0)

			return true;
		{
			return false;
		}

	}

	public static boolean tekMI(int yeniSayi) {
		if (yeniSayi % 2 == 1)
			return true;
		return false;
	}

}
