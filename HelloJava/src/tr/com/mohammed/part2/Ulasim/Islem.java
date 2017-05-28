package tr.com.mohammed.part2.Ulasim;

public class Islem {
	public static void main(String[] args) {
		
		Otobus otobus = new Otobus();
		otobus.numara= "197";
		otobus.ayaktaYolcu=	15;
		otobus.oturanYolcu=	45;
		otobus.yolcuMiktari=100;
		
		Yolcu yolcuFatmaTeyze = new Yolcu();
			yolcuFatmaTeyze.name = "Fatma";
			yolcuFatmaTeyze.hangiOtobustesin(otobus);
			
		
	}

}
