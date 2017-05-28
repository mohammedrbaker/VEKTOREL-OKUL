package tr.com.mohammed.part2.saglik;

public class Hastane {

	public void ameliyet(Doktor doktor, Hemsire hemsire) {

		System.out.println("TC: " + doktor.getTC() + " - "  + "Dr. " + doktor.getName());

		System.out.println("TC: " + hemsire.getTC() + " - " + "Hamsire: " + hemsire.getName());
		
		System.out.println("-------------------------------");

	}

	public void ameliyet(Doktor doktor) {

		System.out.println("TC: " + doktor.getTC() + " - " + "Dr. " + doktor.getName());
	}

}
