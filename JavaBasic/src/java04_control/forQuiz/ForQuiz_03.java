package java04_control.forQuiz;

public class ForQuiz_03 {
//	- 1에서 1000까지의 정수중에서 4로 나누어도
//	 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
	public static void main(String[] args) {

		int total = 0;
		
		for(int i=1; i<=1000; i++) {
			if( i%4==1 && i%6==1 ) {
				total+=i;
			}
		}
		System.out.println(total);
	}
}










