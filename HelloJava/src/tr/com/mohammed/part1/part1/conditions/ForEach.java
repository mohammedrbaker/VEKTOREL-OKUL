package tr.com.mohammed.part1.part1.conditions;

public class ForEach {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				System.out.println();
				for (int z = 0; z <= 10; z++) {
					System.out.print (i + "*" +j + "*"+ z + "=" + i*j*z + ";" +"  ");
				}
				
				
			}
		}
	}

}
