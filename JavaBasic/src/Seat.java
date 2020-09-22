import java.util.Random;

public class Seat {
	public static final int MAX=30; 

	public static void main(String[] args) {

		int[] arr = new int[MAX];

		Random ran = new Random();

		int idx = 0;
		while(true) {
			boolean b = false;
			int num = ran.nextInt(MAX)+1;

			for(int i=0; i<MAX; i++) {
				if(arr[i] == num) {
					b = true;
				}
			}
			if(b == true)
				continue;

			arr[idx++] = num;

			if(idx==MAX) break;
		}

		int a = 1;
		for(int i : arr) {
			System.out.println(a++ + " : " +i);
		}
	}
}









