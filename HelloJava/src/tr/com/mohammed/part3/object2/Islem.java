package tr.com.mohammed.part3.object2;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) {
		Object intVeri = new Integer(5);
		Object stringVeri = new String ("Merhaba");
		Object scannerVeri = new Scanner (System.in);
		
		gonder (intVeri);
		gonder (stringVeri);

	}

	private static void gonder(Object obj) {
		
		if (obj instanceof Integer) {
			
			Integer veri = (Integer)obj;
			System.out.println(veri);
			
		}
		if (obj instanceof String) {
			System.out.println(((String)obj));
		}
		
		
	}

}
