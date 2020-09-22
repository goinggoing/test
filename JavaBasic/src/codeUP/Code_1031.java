package codeUP;

import java.util.Scanner;

//10진수를 입력받아 8진수(octal)로 출력해보자.
//
//참고
//%d(10진수 형태)로 입력받고,
//%o를 사용해 출력하면 8진수(octal)로 출력된다.

public class Code_1031 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("10진수를 입력하세요: ");
		int num = sc.nextInt(); //정수 입력
		sc.close();
		
		System.out.printf("%o", num); //출력형식에 맞게 출력
	}
}
