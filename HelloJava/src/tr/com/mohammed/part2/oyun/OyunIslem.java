package tr.com.mohammed.part2.oyun;

/**
 * 
 * @author vektorel
 *
 */
public class OyunIslem {
	public static void main(String[] args) {
		
		char [] array = {'a','d','a','n','a'};
		Oyun oyun = new Oyun(array);
		oyun.kelimeAl();
		oyun.sonDeger();
	}

}
