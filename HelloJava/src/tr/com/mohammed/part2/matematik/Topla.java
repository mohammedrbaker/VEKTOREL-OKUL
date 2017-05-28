package tr.com.mohammed.part2.matematik;

public class Topla {
	public int a;
	public int b;
	private int sonuc;

	public Topla(int a, int b) {
		this.sonuc = a + b;

	}

	public Topla(int a, int b, int c) {
		this.sonuc = a + b + c;

	}

	public Topla(int[] array) {
		for (int i : array) {
			this.sonuc = sonuc + i;
		}
	}

	public Topla(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			this.sonuc = sonuc + array1[i];
		}
		for (int j = 0; j < array2.length; j++) {
			this.sonuc = sonuc + array1[j];
		}

	}

	public int getSonuc() {
		return sonuc;
	}

	public void setSonuc(int sonuc) {
		this.sonuc = sonuc;
	}

}
