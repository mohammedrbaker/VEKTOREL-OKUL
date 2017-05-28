package tr.com.mohammed.part3.stack;

import java.util.Stack;

public class Islem {
	public static void main(String[] args) {
		
		Stack <String> stack = new Stack<String>();
		stack.push("Mustafa");
		stack.push("Ahmet");
		stack.push("Ali");
		stack.push("Hasan");
		System.out.println(stack);
		for (int i = 0; i < 2; i++) {
			String sil = stack.pop();
			
			System.out.println(sil);
			
		}

		
		//System.out.println("Pop: "+stack.pop());
		System.out.println(stack);
	//	System.out.println("Pop: "+stack.pop());
		System.out.println(stack);
	}

}
