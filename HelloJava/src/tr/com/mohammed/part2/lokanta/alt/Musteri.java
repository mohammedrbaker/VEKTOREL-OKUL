package tr.com.mohammed.part2.lokanta.alt;

import tr.com.mohammed.part2.lokanta.nusrEt;
import tr.com.mohammed.part2.lokanta.recepUsta;

public class Musteri {
	private int id;
//	recepUsta masaSayisiBul = new recepUsta();

//	public void getMasaSayisiBul() {
//
//		System.out.println(masaSayisiBul);
//	}
	
	public void nusretiAra(){
		nusrEt nusrETT = new nusrEt();
		System.out.println(nusrETT.masaSayisi);
	}

	public void nusretiAraEtSor(){
		nusrEt nusrETT = new nusrEt();
		// etMiktari defualt oldugu icin farkli paket icinden erisilemez !
	//	System.out.println(nusrETT.etMiktari);
	}

	
	public void recepUstayiAra(){
		recepUsta recepUstaGarson = new recepUsta();
		System.out.println(recepUstaGarson.garsonSayisi);
	}

	
	
	//nusrEt garsonSayisiBul = new nusrEt();

//	public void getgarsonSayisiBul() {
//
//		System.out.println(garsonSayisiBul);
//	}
}
