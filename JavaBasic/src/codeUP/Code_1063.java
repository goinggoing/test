package codeUP;

import java.util.Scanner;

//입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
//단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

public class Code_1063 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a>b ? a:b); //a와 b를 비교한 후 참이면 a, 거짓이면 b
		
	}
}
