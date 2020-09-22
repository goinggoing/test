package java16_thread.sync;

class SyncTest01 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.println(i + "값 더하기");
		}
	}
}

public class WaitNotifyEx_01 {
	public static void main(String[] args) {
		
		SyncTest01 st = new SyncTest01();
		st.start(); //스레드 활성화, 1~100 덧셈 수행
		
		// Main 스레드가 st 스레드의 동작완료(수행 종료) 시점까지 기다림
		try {
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1~100의 합 : " + st.total); //결과 출력
		
	}
}












