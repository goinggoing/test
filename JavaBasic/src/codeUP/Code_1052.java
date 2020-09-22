package codeUP;

import java.util.Scanner;

//두 정수(a, b)를 입력받아
//a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.

public class Code_1052 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a != b) { //a와 b가 다르면 
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
