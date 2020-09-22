package java02_operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		
		//이항연산자 - 산술
		//	+ - * / %
		
		int num1 = 17, num2 = 4; //피연산자
		int result; //결과 저장
		
		result = num1 + num2; //덧셈연산
//		result = 17 + 4; //덧셈연산
//		result = 21; //덧셈연산
		System.out.println("덧셈 결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("----------");
		result = num1 % num2; //나머지 연산자, modular, mod
		System.out.println("나머지 연산 결과 : " + result);
		
		System.out.println("--- 산술 연산자 ---");
		System.out.println("num1 + num2 = " + (num1+num2) ); //더하기
		System.out.println("num1 - num2 = " + (num1-num2) ); //빼기
		System.out.println("num1 * num2 = " + (num1*num2) ); //곱하기
		System.out.println("num1 / num2 = " + (num1/num2) ); //나누기, 몫
		System.out.println("num1 % num2 = " + (num1%num2) ); //나머지

		// 연산은 반드시 피연산자들이 같은 데이터타입일 때만 가능하다
		// 연산의 결과는 피연산자의 데이터타입으로 나타난다
		
		System.out.println("----------");
		System.out.println( num1 / num2 ); // int/int -> int
		System.out.println( (double)num1 / (double)num2 ); // double/double -> double
		
		// 서로 다른 데이터타입의 연산을 수행하려면 형변환해야한다

		System.out.println( num1 / (double)num2 ); // int / (double)int
//		System.out.println( 17 / (double)4 ); // int / (double)int
//		System.out.println( 17 / 4.0 ); // int / double
//		System.out.println( 17.0 / 4.0 ); // double / double : 자동형변환
//		System.out.println( 4.25 ); // double
		
		System.out.println("----------");

		double d = 3.14;
		
		System.out.println("d/2 = " + d/2);
		System.out.println("d%2 = " + d%2);
		
	}
}
















