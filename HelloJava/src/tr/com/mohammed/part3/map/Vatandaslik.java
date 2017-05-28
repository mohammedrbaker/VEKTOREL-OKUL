package tr.com.mohammed.part3.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Vatandaslik {
	public static void main(String[] args) {
		Map<String, String> vatantas = new HashMap<>();
		
		vatantas.put("123456789", "Mustafa");
		vatantas.put("454456789", "Masan");
		vatantas.put("552226789", "Hilal");
		vatantas.put("854216789", "Mohammed");
		vatantas.put("552246789", "Fatma");
		vatantas.put("101011789", "Zeynep");
		
		System.out.println("Vatandaşlar: "+vatantas);
		System.out.println(vatantas.get("552246789"));
		
		Iterator<Entry<String,String>> iterator = vatantas.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry en = iterator.next();
			System.out.println(en.getKey());
			System.out.println(en.getValue());
		}
		
		
		for (String veri : vatantas.keySet()) {
			System.out.println(veri);
			
		}
	}

}
