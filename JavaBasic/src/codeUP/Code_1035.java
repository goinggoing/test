package codeUP;

import java.util.Scanner;

//16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
//
//참고
//%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
//16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.

public class Code_1035 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("8진수로 변환할 16진수 정수 입력하세요: ");
		int num = sc.nextInt(16); //16진수 정수 입력
		sc.close();
		
		System.out.printf("%o", num); //출력형식에 맞게 출력
	}
}
