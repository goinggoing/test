package java04_control.switchEx;

public class Switch_03 {
	public static void main(String[] args) {

		//switch에서 char 형 다루기
		
		char alpha = 'B';
		
		switch( alpha ) {
		case 'A': //65
			System.out.println("A에요");
			break;
			
		case 66: //'B'
			System.out.println("B입니다");
			break;
			
		case 'C': //67
			System.out.println("C요");
			break;
			
		default:
			System.out.println("A,B,C 다 아님");
		}
		System.out.println("----------");
		
		//실수형 데이터는 switch 사용 불가
//		double d = 1.234;
//		switch(d) {
//		
//		}
		
		//논리형 데이터 switch 사용 불가
//		boolean b = true;
//		switch( b ) {
//		
//		}
		
	}
}
















