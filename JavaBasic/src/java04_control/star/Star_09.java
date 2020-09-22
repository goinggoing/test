package java04_control.star;

public class Star_09 {
	public static void main(String[] args) {
		for(int i=4; i>=0; i--) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
