package java16_thread;

class Daemon implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i + " HI");
		}
	}
}

public class Ex07_Daemon {
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		
		Daemon daemon = new Daemon(); // Runnable 객체 생성
		
		Thread th = new Thread(daemon); //Thread 객체 생성
		
		th.setDaemon(true); // 데몬 스레드로 설정하기
		
		th.start(); // 스레드 활성화
		
		System.out.println("--- Main End ---");
	}
}












