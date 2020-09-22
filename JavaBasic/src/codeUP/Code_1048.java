package codeUP;

import java.util.Scanner;

//정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
//0 <= a <= 10, 0 <= b <= 10
//
//
//참고
//예를 들어 1 3 이 입력되면 1을 23(8)배 하여 출력한다.

public class Code_1048 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int result = num1 << num2; //비트시프트 연산자
		
		System.out.println(result);

	}
}
