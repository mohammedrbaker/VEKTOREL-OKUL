package tr.com.mohammed.part2.Ogrenci;

public class Islem {
	
	public static void main(String[] args) {
		Ogrenci ogrenciAhmet = new Ogrenci ();
		ogrenciAhmet.TC = 123456789;
		ogrenciAhmet.soyisim="Ali";
		
		Ogrenci ogrenciVeli = new Ogrenci ();
		ogrenciVeli.TC = 223445566;
		ogrenciVeli.soyisim = "Recep";
		
		
		Ogretmen mustafaOgretmen = new Ogretmen ();
		mustafaOgretmen.ogretmenId=001;
		mustafaOgretmen.TC=741852963;
		mustafaOgretmen.isim="Mustafa";
		
		
		
		Ogretmen tanerOgretmen = new Ogretmen();
		tanerOgretmen.ogretmenId=002;
		tanerOgretmen.TC=987654321;
		tanerOgretmen.isim="Taner";
		
		//System.out.println(ogrenciAhmet.TC);
		
		System.out.println("ID: " + mustafaOgretmen.ogretmenId);
		System.out.println("TC: " + mustafaOgretmen.TC);
		System.out.println("Ýsim: " + mustafaOgretmen.isim);
		System.out.println("---------------");
		System.out.println("ID: " + tanerOgretmen.ogretmenId);
		System.out.println("TC: " + tanerOgretmen.TC);
		System.out.println("Ýsim: " + tanerOgretmen.isim);
		
		System.out.println("---------------");
		Hizmetli hizmetli = new Hizmetli();
//		hizmetli.hizmetliId=456654123;
//		hizmetli.hizmetliIsim="Ayþe";
		hizmetli.isimYazdir();
		
		String veriGirPassa = hizmetli.veriGirPass();
		System.out.println(veriGirPassa);
		
		
		
	}

}
