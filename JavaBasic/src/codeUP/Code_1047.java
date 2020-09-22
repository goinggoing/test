package codeUP;

import java.util.Scanner;

//정수 1개를 입력받아 2배 곱해 출력해보자.
//
//참고
//*2 의 값을 출력해도 되지만,
//정수를 2배로 곱하거나 나누어 계산해 주는 비트단위시프트연산자 <<, >>를 이용한다.


public class Code_1047 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 1개 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		num = num << 1; //비트시프트 연산자
		
		System.out.println(num);

	}
}
