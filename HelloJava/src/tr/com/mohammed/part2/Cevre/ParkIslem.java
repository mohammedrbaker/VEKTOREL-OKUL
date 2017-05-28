package tr.com.mohammed.part2.Cevre;

public class ParkIslem {

	public static void main(String[] args) {

		Park park = new Park();
		park.setAgacSayi(1000);
		park.setParkIsim("Güven Park");

		System.out.println(park.getParkIsim());

		System.out.println(park.getAgacSayi());
		System.out.println("-----------------------");
		
		
		Park parkGezi = new Park();
		parkGezi.setAgacSayi(1800);
		parkGezi.setParkIsim("Gezi Park");

		System.out.println(parkGezi.getParkIsim());

		System.out.println(parkGezi.getAgacSayi());
	}

}
