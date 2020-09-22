package codeUP;

import java.util.Scanner;

//10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
//단, 0 ~ 255 범위의 정수만 입력된다.

public class Code_1037 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수 입력: ");
		int num = sc.nextInt(); //정수 입력
		sc.close();
		
		System.out.println((char)num); //출력형식에 맞게 출력
	}
}
