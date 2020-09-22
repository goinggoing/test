package java04_control.switchEx;

public class Switch_04 {
	public static void main(String[] args) {

		int num=20;
		
		if( num==10 ) {
			System.out.println("num은 10");
			
		} else if( num==20 ) {
			System.out.println("num은 20");
			
		} else if( num==30 ) {
			System.out.println("num은 30");
			
		} else {
			System.out.println("10, 20, 30 다 아님");
			
		}
		
		System.out.println("----------");
		
		switch (num) {
		case 10:
			System.out.println("num은 10");
			break;
			
		case 20:
			System.out.println("num은 20");
			break;
			
		case 30:
			System.out.println("num은 30");
			break;
			
		default:
			System.out.println("디폴트: 10, 20, 30 다 아님");
		}
		
		System.out.println("------------");
		
		int score = 88;
		if( score>=90 ) {
			System.out.println("A");
		} else if( score>=80 ) {
			System.out.println("B");
		}
		
		System.out.println("------------");

		//switch는 범위비교가 불가능하다 -> if쓰면된다
		switch ( score/10 ) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
		}
	}
}

















