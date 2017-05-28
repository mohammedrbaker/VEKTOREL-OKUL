package tr.com.mohammed.part3.thread;

public class Islem {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
		SayiDon sayiDon = new SayiDon();
		Thread thread = new Thread(sayiDon);
		SayiDon2 sayisDon2 = new SayiDon2();
		Thread yeniThread = new Thread(sayisDon2);
		thread.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println();
		for (int i = 0; i < 1000; i++) {
			System.out.println("* "+i);
			
		}
		
		yeniThread.start();
		
		
	}

}
