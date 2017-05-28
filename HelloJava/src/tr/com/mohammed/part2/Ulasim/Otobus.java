package tr.com.mohammed.part2.Ulasim;

public class Otobus {
	private String model;
	public String numara;
	public int ayaktaYolcu;
	public int oturanYolcu;
	public int yolcuMiktari;
	
	int kacYolcuAlabilir() {
	int sonuc = yolcuMiktari - (this.ayaktaYolcu + this.oturanYolcu) ;
	return sonuc;

	}
}
