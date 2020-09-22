package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
		
		// do-while loop
		
//		do {
//			반복 수행 코드
//		} while( 조건식 );
		
		do {
			System.out.println("실행될까???");
		} while( false );
		// 처음 do 키워드를 만난 후 조건검사없이 반복코드를 수행한다
		//그 이후 조건 검사하고 true/false 판별 후 반복 진행
		
		// 최초 1회를 무조건 실행하고 반복 수행하는 Loop
		
		// 최초 1회 수행이 필요한 예
//		do {
//			  메뉴보여주기
//			  메뉴선택하기
//			  종료 메뉴를 선택하면 종료
//		} while( 3번을 선택하지 않으면 );

		System.out.println("---------------");
		
		int i=0;
		while( i<5 ) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------------");
		
		i=0;
		do {
			System.out.println(i);
			i++;
		} while( i<5 );
		
	}
}














