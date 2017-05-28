package tr.com.mohammed.part2.kalitim.araba;

public class Araba {

	protected void motor() {

	}

	public int ortalamaYakitTuketimi(int[] yakitTuketimi) {
		int ortalama = 0;
		for (int i = 0; i < yakitTuketimi.length; i++) {
			ortalama = ortalama + yakitTuketimi[i];
		}

		return ortalama / yakitTuketimi.length;

	}
	
	public void teker () {
		
	}
	
	public void yakitTuketimiFn () {
		System.out.println("5 Litre");
		
	}

}
