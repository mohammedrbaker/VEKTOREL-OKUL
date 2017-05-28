package tr.com.mohammed.part2.kalitim.bisiklet;

public class Bisiklet implements IBisiklet {

	@Override
	public void pedal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fren() {
		System.out.println("fren çalýþtý");
		diskFren();

	}

	@Override
	public void vites() {
		// TODO Auto-generated method stub

	}

	public void diskFren() {
		System.out.println("diskFren çalýþtý");

	}

}
