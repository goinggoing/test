package java16_thread.quiz;

import java.util.ArrayList;
import java.util.Vector;

public class TestThread {
	public static void main(String[] args) {
		
		new ArrayList().add("A");
		new Vector().add("A");
		
		
		System.out.println("--- main start ---");
		
		Thread increment = new Thread(new Increment(100));
		Thread decrement = new Thread(new Decrement(12, 45));

		increment.start();
		decrement.start();		

		try {
			increment.join();
			decrement.join();
		} catch (InterruptedException e) { }

		System.out.println("--- main end ---");
	}
}
