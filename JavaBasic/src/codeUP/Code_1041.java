package codeUP;

import java.util.Scanner;

//영문자 1개를 입력받아 그 다음 문자를 출력해보자.
//
//영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.

public class Code_1041 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("영문자 입력: ");
		char c = sc.nextLine().charAt(0); //문자 하나 입력
		c += 1; //다음 문자를 저장
		System.out.println(c); //c 출력
	}
}
