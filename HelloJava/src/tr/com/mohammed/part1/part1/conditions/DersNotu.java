package tr.com.mohammed.part1.part1.conditions;

public class DersNotu {
	public static void main(String[] args) {
		
		int studentMark = 50;
		if (studentMark <= -1 | studentMark >= 100) {
			System.out.println("Geçersiz not");
		
	    }else if (studentMark >= 80 ) {
			System.out.println("AA");
		}else if (studentMark >= 70) {
			System.out.println("CC");
		}else if (studentMark >= 50) {
			System.out.println("DD");
		}else if (studentMark < 50) {
			System.out.println("FF");
		}else if (studentMark == 0) {
			System.out.println("D");
		}
		
//		else if (studentMark <= -1 || studentMark >= 100) {
//			System.out.println("Geçersiz not");
//		}
	}

}
