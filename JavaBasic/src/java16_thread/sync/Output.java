package java16_thread.sync;

// 덧셈 결과 출력하는 스레드
public class Output extends Thread{

	SyncData data;
	
	public Output(SyncData data) {
		this.data = data;
	}

	@Override
	public void run() {
		System.out.println("--- Output Start ---");
		
		synchronized (data) {
			
			//덧셈이 완료되지 않았을 경우
			while( !data.available ) {
				try {
					data.wait(); // LOCK 반납
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("TOTAL : " + data.total);
		}
		
		System.out.println("--- Output End ---");
	}
	
}













