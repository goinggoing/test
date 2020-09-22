package codeUP;

import java.util.Scanner;

//2개의 문자를 입력받아서 순서를 바꿔 출력해보자


public class Code_1014 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요(첫번째): ");
		char a = sc.next().charAt(0);
		
		System.out.println("문자를 입력하세요(두번째): ");
		char b = sc.next().charAt(0);
		
		System.out.printf("%s %S", b,a);
//		System.out.print(b + " " + a);
		sc.close();

	}
	
}


