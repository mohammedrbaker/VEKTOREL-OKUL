package tr.com.mohammed.part3.thread;

public class SayiDon implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("### "+i);
			
		}
		
	}
	

}
