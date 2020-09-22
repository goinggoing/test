package java16_thread;

class Thread01 extends Thread { //스레드 클래스
	@Override
	public void run() { //스레드 코드
		for(int i=1; i<=100; i++) {
			System.out.println("Thread : " + i);
			
			try {
				Thread.sleep(50);//스레드를 50밀리초 일시정지 시킨다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex01_classThread {
	public static void main(String[] args) {
		
		Thread01 th01 = new Thread01();
//		th01.run(); // 일반 메소드 호출이니까 하지 말 것! - 스레드 아님
		
		th01.start(); //스레드 실행
		
		for(int i=1; i<=100; i++) {
			System.out.println("Main : " + i);
			
			try {
				Thread.sleep(50);//스레드를 50밀리초 일시정지 시킨다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + 프로그램 종료 + + +");
		
	}
}












