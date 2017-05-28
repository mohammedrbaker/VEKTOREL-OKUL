package tr.com.mohammed.part2.kalitim.matematik;

public class Islem {
	public static void main(String[] args) {
		int[] ara = {10,15,20};
		
		IMatArray matIslem = new Matematik();
		int veri = matIslem.arrayMinBul(ara);

		IDortIslem dortIslem = new Matematik();
		int a = dortIslem.toplama(10, 25);
	}

}
