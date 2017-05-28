package tr.com.mohammed.part2.text;

public class TextIslem {
	public static void main(String[] args) {
		String [] dizi = {"Vektorel","Java","20"};
		TextBirlestir textBirlestir = new TextBirlestir(dizi);
		String veri = textBirlestir.birlestir();
		System.out.println(veri);
	}

}
