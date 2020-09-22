package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		int a=5, b=6, c=10;

		boolean res1;
		res1 = a<b || --a>c++; 
		System.out.println("a="+a+",b="+b+",c="+c);
		
		// OR 연산은 피연산자 둘 중에 하나라도 참이면
		//연산결과를 참(true)으로 리턴한다
		//	-> OR연산자의 왼쪽 피연산자가 참일 경우
		//	  오른쪽 피연산자를 확인(연산)하지 않는다

		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);
		
		// AND 연산은 피연산자 둘 중에 하나라도 거짓이면
		//연산결과를 거짓(false)으로 리턴한다
		//	-> AND연산자의 왼쪽 피연산자가 거짓일 경우
		//	  오른쪽 피연산자를 확인(연산)하지 않는다

	}
}






