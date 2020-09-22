package java04_control.condition;

public class IfElseIfElse {
	public static void main(String[] args) {
		// if ~ else if ~ else
		
//		if( 조건식1 ) {
//			조건식1이 참일 때 수행하는 코드 영역
//		} else if( 조건식2 ) {
//			조건식1이 거짓이고
//			조건식2가 참일 때 수행하는 코드 영역
//		} else if( 조건식3 ) {
//			조건식1 거짓이고
//			조건식2 거짓이고
//			조건식3 참일 때 수행하는 코드 영역
//		} else {
//			조건식 1, 2, 3 모두 거짓일 때 수행하는 코드 영역
//		}
		
		// else 는 없어도 상관없음
		// else는 마지막 제어문으로만 올 수 있다
		
		int num = 77;
		
		if( num>=90 ) {
			System.out.println("A");
		} else if( num>=80 ) { // num<90
			System.out.println("B");
		} else if( num>=70 ) { // num<80
			System.out.println("C");
		} else if( num>=60 ) { // num<70
			System.out.println("D");
		} else { // num<60
			System.out.println("F");
		}
		
	}
}










