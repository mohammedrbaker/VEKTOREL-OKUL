package tr.com.mohammed.part2.Cevre;

public class Park {
	int agacSayi;
	String parkIsim;
	
	public void setAgacSayi(int agacSayi) {
		this.agacSayi = agacSayi/2;
	}
	
	public void setParkIsim(String parkIsim) {
		this.parkIsim = "15 Temmuz " + parkIsim;
	}
	
	public int getAgacSayi() {
		return agacSayi;
	}
	
	public String getParkIsim() {
		return parkIsim;
	}

}
