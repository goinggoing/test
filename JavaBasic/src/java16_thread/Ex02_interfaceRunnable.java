package java16_thread;

class Thread02 implements Runnable { //스레드 클래스
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

public class Ex02_interfaceRunnable {
	public static void main(String[] args) {

		Thread02 th02 = new Thread02();
//		th02.run(); //일반 메소드 호출 - 스레드 생성되지 않음!!!
		
		//Thread클래스의 객체를 생성한다 - 스레드 실행 객체
		Thread thExecutor = new Thread(th02);
		
		thExecutor.start(); //스레드 생성(실행)

		
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












