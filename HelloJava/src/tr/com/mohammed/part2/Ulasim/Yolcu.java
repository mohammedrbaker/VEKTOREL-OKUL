package tr.com.mohammed.part2.Ulasim;

public class Yolcu {
	int id;
	public String name;
	
	Yolcu (){
		
	}
	
	void hangiOtobustesin(Otobus otobus) {

		System.out.println("Daha ka� yolcu alabilir: "+ otobus.kacYolcuAlabilir());
		System.out.println("Otobus No: " + otobus.numara);
		System.out.println("Yolcu Ad�: "+ name);
	}

}
