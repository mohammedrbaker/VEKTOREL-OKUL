package tr.com.mohammed.part1.array;

public class ArrayJava {
	public static void main(String[] args) {
		// char array[] = {'M','O','H','A','M','M','E','D'};
		//
		// for (int i = 0; i < array.length; i++) {
		//
		// System.out.print(array[i]);
		// }

		int intDizi[] = new int[5];

		for (int i = 0; i < intDizi.length; i++) {

			intDizi[i] = (int) Math.pow(i, 3);

			// System.out.println(intDizi[i]);

		}

		for (int i = 0; i < intDizi.length; i++) {

			System.out.println(intDizi[i]);

		}

	}
}
