package java16_thread.quiz;

public class Decrement implements Runnable {

	int end;
	int start;

	public Decrement(int end, int start) {
		this.end = end;
		this.start = start;
	}
	
	@Override
	public void run() {
		while(start > end) {
			System.out.println("\tDecrement : " + start--);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
		
	}
}







