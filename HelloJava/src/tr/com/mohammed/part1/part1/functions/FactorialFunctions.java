package tr.com.mohammed.part1.part1.functions;

import java.util.Scanner;

public class FactorialFunctions {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
			int oku = scan.nextInt();
			
			int veri = factorial (oku);
			System.out.println("veri factorial: " + veri);
			int a=5;
			int b=4;
			//enBuyuk (a, b); 
			//asalBul(5);
	}
	
//	public static void asalBul(int asalSayiMi) {
//		boolean control = true;
//		
//		for (int i = 0; i < asalSayiMi; i++) {
//			if (asalSayiMi %i == 0) {
//				System.out.println("deðildir");
//				control = false;
//				break;
//				
//			}
//			
//		}
//		if (control)
//		System.out.println("bu sayi asaldir");
//		
//		
//	}

	static int factorial (int sayi) {
		int temp = 1;
		// 1*2 =2, 2*3= 6, 6*4=x, x*5=y 
		//
		for (int i = 1; i < sayi; i++) {			
			temp+= temp*i;			
		//	i++;			
		}
		
		System.out.println(temp);
		
		return temp; 
		
	}
	
//	static void enBuyuk (int a, int b) {
//						
//			
//			
//			if (a < b){
//				System.out.println(b);	
//			}
//				
//			else {
//				System.out.println(a);
//			}
//			
//			//return a ;
//						
//		}
		
			
			
			
			
		
}
