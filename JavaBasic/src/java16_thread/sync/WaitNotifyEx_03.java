package java16_thread.sync;

public class WaitNotifyEx_03 {
	public static void main(String[] args) {
		
		SyncData data = new SyncData();
		
		Output o = new Output(data);
		Input i = new Input(data);
		
		o.start();
		i.start();
		
	}
}












