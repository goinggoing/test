package java04_control.loop;

public class For_08 {
	public static void main(String[] args) {
		
		//제어문 중첩 시키기
		
		//if 중첩
		int num = 11;
		if( num>=1 ) {
			System.out.println("1보다 크거나 같다");
			
			if( num<=100 ) {
				System.out.println("1보다 크거나 같다");
				System.out.println("100보다 작거나 같다");
				
				System.out.println("1~100 사이의 정수");
			}
			
			System.out.println("1보다 크거나 같다");
		}
		
		
		//for문과 if문 중첩
		for( int i=0; i<10; i++ ) {
			
			if( i%2==0 ) {
				System.out.println("짝수 : " + i);
			}
			
		}

		for( int i=0; i<10; i+=2 ) {
			System.out.println("짝수 : " + i);
		}
		
	}
}


















