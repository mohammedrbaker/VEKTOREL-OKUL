package tr.com.mohammed.part2.oyun;

import java.util.Scanner;

public class Oyun {

	char[] array;
	char[] kullaniciArrayi;
	char[] goster;
	Scanner scanner = new Scanner(System.in);

	public Oyun(char[] array) {
		this.array = array;

	}

	public void kelimeAl() {
		this.kullaniciArrayi = new char[this.array.length];
		for (int i = 0; i < kullaniciArrayi.length; i++) {
			this.kullaniciArrayi[i] = scanner.next().charAt(0);

		}

		eslestir();
	}

	public void eslestir() {
	//	this.goster = new char[this.array.length];
		this.goster = new char[this.array.length];
		for (int i = 0; i < this.array.length; i++) {
			boolean control = true;
			for (int j = 0; j < kullaniciArrayi.length; j++) {
				if (this.array[i] == this.kullaniciArrayi[j]) {
					control = false;
					this.goster[i] = this.kullaniciArrayi[j];
				}
				if (control) {
					this.goster[i] = '_';
				}
			}
		}
		sonDeger();

	}

	public void sonDeger() {

		String orjinal = new String(this.array);
		String deger = new String(this.goster);

		System.out.println(deger);

		String kullanici = scanner.next();

		if (kullanici.equals(orjinal)) {
			System.out.println("10 puan");
		} else
			System.out.println("olmadý be dostum");

	}

}
