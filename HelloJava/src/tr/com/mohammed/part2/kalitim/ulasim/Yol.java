package tr.com.mohammed.part2.kalitim.ulasim;

public class Yol {
	String isim;
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	public int getSeritSayisi() {
		return seritSayisi;
	}

	public void setSeritSayisi(int seritSayisi) {
		this.seritSayisi = seritSayisi;
	}

	String tipi;
	int seritSayisi;
	
	public void hizSiniri () {
		System.out.println("Hýz Sýnýrý: 80 KM");
	}
	
	
	public int yolHesaplma (int [] yolArray) {
		int sonuc = 0;
		
		for (int i : yolArray) {
			
			sonuc += i;
		}
		
		return sonuc;
	}

}
