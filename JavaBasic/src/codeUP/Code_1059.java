package codeUP;

import java.util.Scanner;

//입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.

public class Code_1059 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 1개 입력: ");
		int a = sc.nextInt();
		sc.close();
		
		System.out.println(~a);
		
	}
}
