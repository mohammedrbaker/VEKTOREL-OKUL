package tr.com.mohammed.part3.stack;

import java.util.Stack;

public class OtobusValizIndiBindi {
	public static void main(String[] args) {
		
		Stack <String> valizIndiBindi = new Stack<String>();
		valizIndiBindi.push("Valiz 1");
		valizIndiBindi.push("Valiz 2");
		valizIndiBindi.push("Valiz 3");
		
		System.out.println("ilk yolcu eskiþehi yolunda indi: " + valizIndiBindi.pop());
		System.out.println("ikinci yolcu eskiþehi yolunda indi: " + valizIndiBindi.pop());
		
		System.out.println("kalan yolcu: "+valizIndiBindi);
		valizIndiBindi.push("Valiz 5");
		valizIndiBindi.push("Valiz 6");
		System.out.println(valizIndiBindi);
	}

}
