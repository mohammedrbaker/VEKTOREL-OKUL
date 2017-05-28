package tr.com.mohammed.part2.saglik;

public class Islem {
	public static void main(String[] args) {
		Doktor doktor = new Doktor();
		doktor.setTC(2122);
		doktor.setName("Ahmet");
		
		Hemsire hemsire = new Hemsire();
		hemsire.setTC(55556);
		hemsire.setName("Ayþe");
		
		Hastane hastane = new Hastane ();
		hastane.ameliyet(doktor, hemsire);
		hastane.ameliyet(doktor);
		
	}

}
