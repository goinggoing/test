package java04_control.loop;

public class For_01 {
	public static void main(String[] args) {
		
		//반복문, Loop
		//	for, while, do-while
		
//		for( 초기식; 조건식; 증감식 ) {
//			반복적으로 수행될 코드 영역
//			조건식이 true일 때 수행한다
//		}
		
		int i;
		for( i=0; i<5; i++ ) {
			System.out.println("HI : " + i);
		}
		// i변수가 0으로 시작해서 5보다 작은 동안 1씩 증가하며 반복
		
		//수행순서
		//		1. 초기식 수행
		//		2. 조건식 판별
		//			2-1. true일 때, 3번 수행
		//			2-2. false일 때, for문 종료
		//		3. 반복코드 1회 수행
		//		4. 증감식 수행
		//		5. 2번 수행
		
	}
}










