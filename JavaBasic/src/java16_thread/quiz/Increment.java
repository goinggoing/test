package java16_thread.quiz;

public class Increment implements Runnable {
	
	int start = 1;
	int end;
	
	public Increment(int end) {
		this.end = end;
	}
	
	@Override
	public void run() {
		while(start < end) {
			System.out.println("Increment : " + (start+=2));
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) { }
		}
	}
}









