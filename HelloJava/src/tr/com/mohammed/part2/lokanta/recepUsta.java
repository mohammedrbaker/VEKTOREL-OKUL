package tr.com.mohammed.part2.lokanta;

public class recepUsta {
	private int id;
	public int masaSayisi;
	public int garsonSayisi;
	public int etMiktari;

	void etMiktariSorgula() {
		nusrEt nusret = new nusrEt();
		System.out.println(nusret.etMiktari);

	};

}
