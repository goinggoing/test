package codeUP;

import java.util.Scanner;

//입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
//단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.

public class Code_1064 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 3개 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int min  = a > b ? (b > c ? c : b) : (a > c ? c : a); //a > b를 판단 후 참, 거짓에 다시 삼항 연산 
		System.out.println(min); 
		
	}
}
