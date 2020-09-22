package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {
		
		int num = 5;

		if( num>0 ) {
			System.out.println("0보다 크다"); //양수

			if( num<=100 ) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");

				System.out.println("1~100사이의 숫자");
			}
		} else { // num<=0, num은 음수거나 0
			System.out.println("양수가 아닙니다");

			if( num==0 ) {
				System.out.println("0입니다");
			} else {
				System.out.println("음수입니다");
			}
		}

		
	}
}








