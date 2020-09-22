package java10_api;

public class MathEx {
	public static void main(String[] args) {
		
		System.out.println(Math.PI);// 원주율 출력		PI
		
		System.out.println(Math.abs(-10));// -10의 절대값		abs
		
		System.out.println(Math.ceil(3.7));// 3.7의 올림값		ceil
		
		System.out.println(Math.floor(3.7));// 3.7의 내림값		floor

		System.out.println(Math.round(-3.7));// -3.7의 반올림값	round

		System.out.println(Math.pow(2.1, 3));// 2.1의 3제곱값	pow

		System.out.println(
				Math.max(3.14, 3.141592));// 3.14와 3.141592 중 큰 값		max

		System.out.println("---------------------------");
		
		// 0.0(포함) ~ 1.0(제외) 사이의 난수(랜덤)
		System.out.println( Math.random() );
		System.out.println( Math.random() );
		System.out.println( Math.random() );
		System.out.println( Math.random() );
		
		System.out.println("----------");
		
//		Math.random(); //0.0 ~ 1.0
//		Math.random() * 100; // 0.0 ~ 100.0
//		Math.round( Math.random() * 100 ); // 0 ~ 100
//		Math.round( Math.random() * 100 ) + 50; // 50 ~ 150
		
		System.out.println(
				Math.round( Math.random() * 100 ) + 50 );
		
	}
}













