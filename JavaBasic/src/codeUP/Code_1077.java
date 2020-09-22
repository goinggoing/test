package codeUP;

import java.util.Scanner;

//정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.

public class Code_1077 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i<=num; i++) {
			System.out.println(i);
		}
		
	}
}
