package java04_control.star;

public class Star_11 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i-1; j++) {
				System.out.print("?");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
