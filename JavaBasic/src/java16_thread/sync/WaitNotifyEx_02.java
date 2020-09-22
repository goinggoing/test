package java16_thread.sync;

class SyncTest02 extends Thread {
	int total = 0;
	
	@Override
	public void run() {
		
		synchronized (this) { //동기화 블록
			for(int i=1; i<=100; i++) {
				this.total += i;
				System.out.println(i + "값 더하기");
			}
		}
		
//		action(this); //동기화 메소드 호출
		
	}
	
//	public synchronized void action(SyncTest02 st) { //동기화 메소드
//		for(int i=1; i<=100; i++) {
//			st.total += i;
//			System.out.println(i + "값 더하기");
//		}
//	}
}

public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		
		SyncTest02 st = new SyncTest02();
		st.start(); //스레드 활성화, 1~100 덧셈 수행
		
		synchronized (st) { //동기화 블록
			
			try {
				st.wait(); //스레드를 동기화 대기상태로 만들기
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("1~100의 합 : " + st.total); //결과 출력
		}
		
//		action(st); //동기화 메소드 호출
	}
	
	//동기화 메소드
//	public synchronized static void action(SyncTest02 st) {
//		System.out.println("1~100의 합 : " + st.total); //결과 출력
//	}
	
}












