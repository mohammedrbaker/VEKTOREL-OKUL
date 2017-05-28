package tr.com.mohammed.part2.kalitim.ulasim;

public class Islem {
	public static void main(String[] args) {
		OtoYol otoYol = new OtoYol();
		otoYol.hizSiniri();
		
		KoyYol koyYol = new KoyYol();
		System.out.println();		
		koyYol.setIsim("koy yolu");
		koyYol.setTipi("Asfalt");
		koyYol.setSeritSayisi(3);
		koyYol.hizSiniri();
		
		System.out.println(koyYol.getIsim());
		System.out.println(koyYol.getTipi());
		System.out.println(koyYol.getSeritSayisi());
		System.out.println();	
		//int[] array = {100,200};
		
		int [] array = new int [3];
		array [0]=100;
		array [1]=200;
		array [2]=300;
		
		int sonuc = koyYol.yolHesaplma(array);
		System.out.println(sonuc);
		
		
	}

}
