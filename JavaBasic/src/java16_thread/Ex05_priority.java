package java16_thread;

public class Ex05_priority extends Thread {
	
	private int idx; //스레드 인덱스
	
	//생성자
	public Ex05_priority(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx + " 스레드 시작");
		
		for(int i=0; i<500; i++)
			System.out.print(idx);
		
		System.out.println(idx + " 스레드 끝");
	}
	
	public static void main(String[] args) {
		System.out.println("Main 스레드 시작");
		
		Ex05_priority t1 = new Ex05_priority(1);
		Ex05_priority t2 = new Ex05_priority(2);
		Ex05_priority t3 = new Ex05_priority(3);
		
		// 자바의 Thread는
		//Round Robin알고리즘(순환할당)과
		//Priority(우선순위)를 적용해서
		//스레드 스케줄링을 한다
		
		//우선순위 적용
		t1.setPriority(Thread.MIN_PRIORITY); //1
		t2.setPriority(Thread.NORM_PRIORITY); //5
		t3.setPriority(Thread.MAX_PRIORITY); //10
		
		//스레드 활성화
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
	}
}















