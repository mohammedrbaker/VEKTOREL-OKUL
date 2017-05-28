package tr.com.mohammed.part2.spor;

public class Islem {
	public static void main(String[] args) {

		Spor basketbol = new Spor();
		basketbol.setSportTuru("Basketbol");
		Spor futbolbol = new Spor();
		futbolbol.setSportTuru("Futbol");
		Spor volebol = new Spor();
		volebol.setSportTuru("Volebol");
		Spor bassbol = new Spor();
		bassbol.setSportTuru("Bassbol");

		Spor[] sportTuruArray = new Spor[4];
		sportTuruArray[0] = basketbol;
		sportTuruArray[1] = futbolbol;
		sportTuruArray[2] = volebol;
		sportTuruArray[3] = bassbol;

		System.out.println("Sport Turu: " + sportTuruArray[0].getSportTuru());
		System.out.println("Sport Turu: " + sportTuruArray[1].getSportTuru());
		System.out.println("Sport Turu: " + sportTuruArray[2].getSportTuru());
		System.out.println("Sport Turu: " + sportTuruArray[3].getSportTuru());

		System.out.println();

		System.out.println("< - - - - - - - - For yapýsý - - - - - - - - - > ");
		System.out.println();

		for (int i = 0; i < sportTuruArray.length; i++) {
			System.out.println("For kullanarak Sport Turu: " + sportTuruArray[i].getSportTuru());
			System.out.println("For kullanarak Oyuncu sayýsý " + sportTuruArray[i].getOyuncuSayisi());
		}

		System.out.println();

		System.out.println("< - - - - - - - - Metot yapýsý - - - - - - - - - > ");
		System.out.println();
		ekranaYaz(sportTuruArray);
	}

	public static void ekranaYaz(Spor[] sportTuruArray) {

		for (int i = 0; i < sportTuruArray.length; i++) {

			System.out.println(" Metot ile spor türü çaðýrma: " + sportTuruArray[i].getSportTuru());

		}

	}

}
