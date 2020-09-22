package codeUP;

import java.util.Scanner;

//입력된 정수의 부호를 바꿔 출력해보자.
//단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
//
//참고
//단항 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대로 바뀌어 계산된다.

public class Code_1040 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num < -2147483647 || num > 2147483647) { //num이 범위 밖
			System.out.println("범위 안의 정수를 입력하세요.");
		} else { //num이 범위 내 
			System.out.println(-num);
		}
			
	}
}
