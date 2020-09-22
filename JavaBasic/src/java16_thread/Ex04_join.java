package java16_thread;

import java.util.Random;

public class Ex04_join extends Thread {

	private int idx; //스레드 인덱스
	
	public Ex04_join(int idx) {
		this.idx = idx;
	}
	
	@Override
	public void run() {
		System.out.println(idx + " 스레드 시작");
		
		Random ran = new Random();
		try {
			// 0~3000밀리초의 랜덤한 Sleep
			Thread.sleep(ran.nextInt(3000));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(idx + " 스레드 끝");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main 스레드 시작");

		Ex04_join t1 = new Ex04_join(1);
		Ex04_join t2 = new Ex04_join(2);
		Ex04_join t3 = new Ex04_join(3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			// join() - 다른 스레드의 종료를 기다리게하는 메소드
			//	Main Thread가 t1, t2, t3 스레드의 종료를 기다린다
			t1.join();
			t2.join();
			t3.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 끝");
		
	}

}














