package codeUP;

import java.util.Scanner;

//'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.

public class Code_1079 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("영문자 입력: ");
		char ch;
		
		while(true) {
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				break;
			}
			System.out.println(ch);
		}
		sc.close();
		
	}
}
