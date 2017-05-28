package tr.com.mohammed.part3.map;

import java.util.HashMap;
import java.util.Map;

public class Islem {
	public static void main(String[] args) {
		Map <Integer, String> ogrenci = new HashMap<>();
		ogrenci.put(1, "Ahmet");
		ogrenci.put(3, "Hasan");
		ogrenci.put(2, "Anýl");
		ogrenci.put(4, "Cemal");
		ogrenci.put(5, "Cemal");
		
		System.out.println(ogrenci);
		System.out.println(ogrenci.size());
		System.out.println(ogrenci.get(2));
	}


}
