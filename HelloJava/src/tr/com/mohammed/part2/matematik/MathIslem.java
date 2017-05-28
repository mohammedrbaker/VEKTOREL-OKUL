package tr.com.mohammed.part2.matematik;

public class MathIslem {
	public static void main(String[] args) {
		
		Topla toplaBir = new Topla(1,2);
		Topla toplaIki = new Topla(1,2,3);
		int [] a = {3,4,5};
		Topla toplaDiziBir = new Topla(a);
		int [] b = {5,5,5};
		int [] c = {5,5,5};
		Topla toplaDiziIki = new Topla(b,c);
		System.out.println("Ýki Sayýnýn Toplamý: "+toplaBir.getSonuc());
		System.out.println("Üç Sayýnýn Toplamý: "+toplaIki.getSonuc());
		System.out.println("Tekli Dizi Toplamý: "+toplaDiziBir.getSonuc());
		System.out.println("Ýkili Dizi Toplamý: "+toplaDiziIki.getSonuc());
		
	}

}
