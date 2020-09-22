package codeUP;

import java.util.Scanner;

//두 가지의 참(1) 또는 거짓(0)이 입력될 때,
//참/거짓이 서로 다를 때에만 참을 출력하는 프로그램을 작성해보자.

public class Code_1056 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력(0,1): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if((a == 1 && b == 0) || (a == 0 && b == 1)) { //a와b의 값이 다른 경우 
			System.out.println(1);
		} else { 
			System.out.println(0);
		}
		
	}
}
