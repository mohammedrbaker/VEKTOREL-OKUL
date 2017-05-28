package tr.com.mohammed.part2.kalitim.matematik;

public class Matematik implements IMatArray, IDortIslem {

	@Override
	public int toplama(int a, int b) {

		return a + b;
	}

	@Override
	public int cikarma(int a, int b) {

		return a - b;
	}

	@Override
	public int[] buSayiyaKadarKareBul(int deger) {
		int[] array = new int[deger];

		for (int i = 1; i < deger; i++) {
			int sayi = (int) Math.pow(i, 2);
			array[i-1] = sayi;
			if (sayi >= deger);
			break;
		}

		return array;

	}

	@Override
	public int arrayMinBul(int[] array) {
		int min = array [1];
		for (int i = 0; i < array.length; i++) {
			min = Math.min(i, min);
		}

		return min;

	}

}
