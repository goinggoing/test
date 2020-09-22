package codeUP;

import java.util.Scanner;

//평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.

public class Code_1069 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("문자 입력: ");
		char ch = sc.next().charAt(0); //입력받은 문자열 중 첫 번째 문자를 ch에 저장
		sc.close();
		
		switch(ch) { // 입력 받은 ch를 비교
		case 'A':
			System.out.println("best!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
			break;
		}
		
	}
}
