package tr.com.mohammed.part2.kalitim.gora;

public class Gezegen implements IDoga{
	
	public void gezegeniKurtar () {
		ates ();
		su ();
		toprak (); 
		tahta ();
		
	}

	@Override
	public void ates() {
		System.out.println("ateþ");
		
	}

	@Override
	public void su() {
		System.out.println("su");
		
	}

	@Override
	public void toprak() {
		System.out.println("toprak");
		
	}

	@Override
	public void tahta() {
		System.out.println("tahta");
		
	}
	
	

}
