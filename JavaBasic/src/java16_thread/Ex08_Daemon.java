package java16_thread;

class Daemon2 implements Runnable {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("\nAuto Save....");
		}
	}
}

public class Ex08_Daemon {
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		
		Thread th = new Thread(new Daemon2()); //스레드 생성
		th.setDaemon(true); //데몬스레드 설정
		th.start();
		
		// 0.01마다 0~9 를 출력하는 반복문
		for(int i=0; i<500; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.print(i%10);
		}
		
		System.out.println("--- Main End ---");
	}
}
















