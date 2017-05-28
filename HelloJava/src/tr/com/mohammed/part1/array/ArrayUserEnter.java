package tr.com.mohammed.part1.array;

import java.util.Scanner;

public class ArrayUserEnter {

	public static void main(String[] args) {

		double doubleDizi[] = new double[3];
		// double doubleDizi [] = new double [3];

		for (int i = 0; i < doubleDizi.length; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Dizi elemaný giriniz: ");
			double diziOku = scanner.nextDouble();
			doubleDizi[i] = diziOku;

		}

		for (int i = 0; i < doubleDizi.length; i++) {

			System.out.println(doubleDizi[i]);
		}

	}

}
