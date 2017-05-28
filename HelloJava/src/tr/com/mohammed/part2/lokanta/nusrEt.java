package tr.com.mohammed.part2.lokanta;

public class nusrEt {
	private int id;
	public int masaSayisi;
	public int garsonSayisi;
	int etMiktari;

	void etMiktariSorgula() {
		recepUsta recepUsta = new recepUsta();
		System.out.println(recepUsta.etMiktari);

	};

}
