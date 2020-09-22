package java02_operator;

public class BinaryEx_02 {
	public static void main(String[] args) {
		
		//이항연산자 - 대입(Assign)
		//	=
		
		//	오른쪽에 있는 값을 왼쪽에 있는 공간에 저장
		
		//  우선순위가 거의 최하위에 있는 연산자
		
		//	연산방향은 오른쪽에서 왼쪽
		
		int num1 = 10; //10대입
		int num2 = 20; //20대입
		
		num1 = 11; //11대입
		num2 = 22; //22대입
		
		int num3 = num2; // num3 = 22;
		
		int num4;
		int num5;
		int num6;
		
		num6 = num5 = num4 = num3;
//		num6 = num5 = num4 = 22;
//		num6 = num5 = 22;
//		num6 = 22;
//		22;
		
		
		//복합대입연산자 - 산술대입
		//	 += -= *= /= %=
		
		System.out.println("--- 산술대입 연산 전 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 += num1; //산술대입
		num2 = num2 + num1;
		
		System.out.println("--- 산술대입 연산 후 ---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		
		// 대입연산자가 오른쪽
		num2 -= num1; // -= 산술복합대입연산자(이항)
		num2 =- num1; // - 음수변환 연산자(단항)
		
	}
}













