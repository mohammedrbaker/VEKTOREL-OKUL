package tr.com.mohammed.part1.part1.functions;

public class JavaFunctions {
	
	public static void main(String[] args) {
		
		 ekranaSekilBas (6);
		 toplama (5,10);
		 ekranaSekilBas (5); 
		 cikarma (18,2);		 			 
		 
	}
	
	 static void ekranaSekilBas (int a) {
		 for (int i = 0; i <a; i++) {
			 System.out.print("*");
		}
		 System.out.println("");
	 } 
	 
	 
	 static void toplama (int sayi1, int sayi2){
		 int c =0;
		 c= sayi1+sayi2;
		 System.out.println(c);
		 		 
	 }
	 static void cikarma (int sayi1, int sayi2){
		 int c =0;
		 c= sayi1-sayi2;
		 System.out.println(c);
		 		 
	 }
}
