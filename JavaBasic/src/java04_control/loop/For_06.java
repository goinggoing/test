package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		//구구단 2단을 출력
		
		//출력 예시)
		//	2 x 1 = 2
		//	2 x 2 = 4
		//	...
		//	2 x 9 = 18
		
		//반복횟수 : 9번
		//반복구간 : 1~9

		//초기식 : int i=1;	(반복구간의 시작값)
		//조건식 : i<=9;	(반복구간의 끝값, 반복횟수)
		//증감식 : i++		(1씩 증가)
		
		for( int i=1; i<=9; i++ ) { //i, 1~9, 9번
			System.out.println( "2 x " + i + " = " + (2*i) );
		}
	}
}













