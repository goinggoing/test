package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		//1부터 10까지 총합 구하기
		
		//반복횟수 : 10번
		//반복구간 : 1~10

		//초기식 : int i=1	(반복구간의 시작값)
		//조건식 : i<=10	(반복구간의 끝값, 반복횟수)
		//증감식 : i++		(1씩 증가)
		
		int sum = 0; //쓰레기값 조심
		for( int i=1; i<=10; i++ ) {
//			System.out.println(i);
			
			sum = sum + i;
		}
		
		System.out.println("1~10의 합계 : " + sum);
		
	}
}














