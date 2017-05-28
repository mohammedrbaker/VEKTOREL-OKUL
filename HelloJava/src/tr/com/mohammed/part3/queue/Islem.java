package tr.com.mohammed.part3.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Islem {
	public static void main(String[] args) {
		Queue <String> queue = new LinkedList <String> ();
		queue.offer("Mohammed");
		queue.offer("Ahmet");
		queue.offer("Ali");
		
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		
	}

}
