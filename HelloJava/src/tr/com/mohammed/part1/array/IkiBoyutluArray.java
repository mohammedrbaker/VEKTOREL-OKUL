package tr.com.mohammed.part1.array;

import java.util.Scanner;

public class IkiBoyutluArray {

	public static void main(String[] args) {

		// int a[][] = diziOku();
		String[][] dizi = diziOku();
		diziYazdir(dizi);
	}

	// private static int[][] diziOku() {
	// int[][] intDizi = new int[5][5];
	// Scanner scanner = new Scanner(System.in);
	// for (int i = 0; i < 5; i++) {
	// for (int j = 0; j < 5; j++) {
	// intDizi[i][j] = (i + 1) + (j + 1);
	// }
	//
	// }
	// return intDizi;
	//
	// }

	private static String[][] diziOku() {
		String[][] intDizi = new String[5][5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intDizi[i][j] = scanner.nextLine();
			}

		}
		return intDizi;

	}

	public static void diziYazdir(String[][] diziAl) {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.println(diziAl[i][j]);
			}

		}

	}
}
