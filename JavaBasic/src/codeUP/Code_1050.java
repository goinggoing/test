package codeUP;

import java.util.Scanner;

//두 정수(a, b)를 입력받아
//a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
//
//
//참고
//어떤 값을 비교하기 위해 비교/관계연산자(comparison/relational)를 사용할 수 있다.

public class Code_1050 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if(num1 == num2) { //두 정수가 같으면
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
