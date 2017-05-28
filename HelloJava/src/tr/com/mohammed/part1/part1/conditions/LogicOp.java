package tr.com.mohammed.part1.part1.conditions;

public class LogicOp {
	public static void main(String[] args) {
		
		
		String sValOne = "Mohammed";
		String sValTwo = "My Second Value";
		
		if (sValOne != null && sValOne.equals("Mohammed")) {
			System.out.println(sValOne);
						
		}
		
		else if (sValTwo.equals("My Second Value") || sValOne.equals ("Mohammed")) {
			System.out.println(sValTwo);
		}
	}

}
