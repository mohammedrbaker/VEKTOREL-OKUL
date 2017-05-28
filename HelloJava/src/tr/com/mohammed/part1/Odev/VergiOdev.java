package tr.com.mohammed.part1.Odev;
import java.util.Scanner;
public class VergiOdev {

	
	
	//package tr.com.mohammed.part1.part1.odevler;

	

	/**
	 * Created by Mohammed on 5/2/2017.
	 */

	


//	public class VergilendirmeOdevi {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Lütfen gelirinizi giriniz:");
	        //int gelir;
	        float veriglendirme;
	        int gelir = scanner.nextInt();
	        if (gelir <= 150000000) {
	            veriglendirme = ((gelir/100) * 25);
	            System.out.println("Vergi tutarýnýz: "+ veriglendirme + " TL");
	        }
	        else if (gelir <= 300000000) {
	            veriglendirme = ((gelir/100) * 30);
	            System.out.println("Vergi tutarýnýz: "+ veriglendirme + " TL");
	        }
	        else if (gelir <= 600000000) {
	            veriglendirme = ((gelir/100) * 35);
	            System.out.println("Vergi tutarýnýz: "+ veriglendirme + " TL");
	        }
	        else if (gelir <= 1200000000) {
	            veriglendirme = ((gelir/100) * 40);
	            System.out.println("Vergi tutarýnýz: "+ veriglendirme + " TL");
	        }
	        else if (gelir > 1200000000) {
	            veriglendirme = ((gelir/100) * 50);
	            System.out.println("Vergi tutarýnýz: "+ veriglendirme + " TL");
	        }

	    }

	}


