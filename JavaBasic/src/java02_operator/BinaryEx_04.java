package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//이항연산자 - 논리
		//	&& || !
		// 	( ! 연산자는 단항 연산자 )
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2) );
		System.out.println("true||false : " + (b1||b2) );
		
		System.out.println("----------");
		
		int num = 88;
		System.out.println( (num>=1) && (num<=100) );
//		System.out.println( (88>=1) && (88<=100) );
//		System.out.println( true && true );
//		System.out.println( true );
		
//		System.out.println( 1 <= num <= 100 ); // 1<=num을 먼저 연산
//		System.out.println( true <= 100 ); // true와 100을 비교할 수 없음
		
		System.out.println( !( (num>=1) && (num<=100) ) );
		System.out.println( !( (88>=1) && (88<=100) ) );
		System.out.println( !( true && true ) );
		System.out.println( !( true ) );
		System.out.println( false );
		
		System.out.println( (num<1) || (num>100) );
		
	}
}













