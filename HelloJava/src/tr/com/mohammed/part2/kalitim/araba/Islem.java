package tr.com.mohammed.part2.kalitim.araba;

public class Islem {
	public static void main(String[] args) {
		Sedan sedan = new Sedan ();
		sedan.yakitTuketimiFn();
		
		int[] arrya = {10,6,8,9};
		int yakit = sedan.ortalamaYakitTuketimi(arrya);
		System.out.println(yakit);
		HB hb = new HB ();
		int[] arrya2 = {18,1,9,19};
		hb.motor();
		
		int yakit2 = hb.ortalamaYakitTuketimi(arrya2);
		System.out.println(yakit2);
	}

}
