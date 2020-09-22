package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
//	 + 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
//		>> Input Number : -3
//		>> 음수입니다
//
//	 + 입력한 데이터가 3의 배수인지 판별하시오
//	  (% 연산자 사용)
//		>> Input Number : 7
//		>> 3의 배수가 아닙니다
//
//	 + 두 수를 입력 받아 큰 수를 출력하시오
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 이 더 큰 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //표준입력객체
		
		int num1;
		int num2;

		System.out.println("---1번 양수 음수 판별--------------");

		//양수,음수 판별
		System.out.print("Input Number : ");
		num1 = sc.nextInt();
		
		if( num1>0 ) { //양수일 때
			System.out.println(num1 + "은/는 양수입니다");
		}
		
		if( num1<0 ) { //음수일 때
			System.out.println(num1 + "은/는 음수입니다");
		}
		
		if( num1==0 ) {
			System.out.println("입력한 숫자는 0입니다");
		}
		
		System.out.println();
		System.out.println("---2번 3의 배수 판별--------------");
		
		System.out.print("Input Number : ");
		num1 = sc.nextInt();

		if( num1%3 == 0 && num1 != 0 ) { //3의 배수일 때
			System.out.println(num1 + "은/는 3의 배수입니다");
		}
		if( num1%3 != 0 || num1 == 0 ) { //3의 배수가 아닐 때
			System.out.println(num1 + "은/는 3의 배수가 아닙니다");
		}
		
		System.out.println();
		System.out.println("---3번 둘 중 큰 수 판별------------------");
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) { //num1이 클 때
			System.out.println("num1[" + num1 + "]이/가 큽니다");
		}
		if(num1 < num2) { //num2가 클 때
			System.out.println("num2[" + num2 + "]이/가 큽니다");
		}
		if(num1 == num2) { //같을 때
			System.out.println("num1, num2가 ["+ num1 + "](으)로 같습니다");
		}
		
		
	}
}












