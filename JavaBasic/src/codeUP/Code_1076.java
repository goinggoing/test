package codeUP;

import java.util.Scanner;

//영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.

public class Code_1076 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("영문자 입력: ");
		char ch = sc.nextLine().charAt(0);
		char first = 'a'; //입력받은 문자와 비교할 변수(문자의 시작 'a')
		
		do {
			System.out.print(first + " ");
			first++;
		} while (first <= ch);
		sc.close();
		
	}
}
