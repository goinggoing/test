package java04_control.star;

public class Star_12 {
	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

		final int LINE = 9;
		
		for(int i=0; i<LINE; i++) { // 행

			if( i<=LINE/2) { // 9 행중에 가운데 줄까지
				for(int j=0; j<i+1; j++) { // 열
					System.out.print("*");
				}
			}
			
			if( i>LINE/2 ) { // 9행 중에서 가운데 이후
				for(int j=0; j<LINE-i; j++) { // 열
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
	}
}











