package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {

//		첫날에 10원을 예금하고,
//		다음날에는 전날의 2배를
//		예금하는 방식으로
//		보름(15일) 동안 저축한 금액은?
//			-> 327670
		
		// 1. 15일 동안... (반복)
		
		// 2.
		//	반복횟수: 15번
		//	반복구간: 0~14
		
		//	초기식: int i=0;
		//	조건식: i<15;
		//	증감식: i++
		
		// 3. 매일 해야하는 일
		//	반복 한번에 수행해야하는 코드
		//		a. 예금액 두배로 늘리기
		//		b. 총금액에 예금액을 더하기
		
		
		int money = 10; //예금액
		int account = 0; //총금액
		
		for( int i=0; i<15; i++ ) { //i, 0~14, 15번 (15일동안)
			account += money; //예금액을 총 금액에 더하기

			money *= 2; //예금액 2배로 증가
			
		}
		
		System.out.println("저축한 총 금액 : " + account + "원");
	}
}












