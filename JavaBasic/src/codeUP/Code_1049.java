package codeUP;

import java.util.Scanner;

//두 정수(a, b)를 입력받아
//
//a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력하는 프로그램을 작성해보자.

public class Code_1049 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 2개 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		if(num1 > num2) { //num1이 num2보다 큰 경우
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
