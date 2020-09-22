package codeUP;

import java.util.Scanner;

//정수 2개를 입력받아 그대로 출력해보자(입력된 두 정수를 공백으로 구분하여 출력)


public class Code_1013 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요(첫번째): ");
		int a = sc.nextInt();
		
		System.out.println("정수를 입력하세요(첫번째): ");
		int b = sc.nextInt();
		
		System.out.printf("%d %d", a,b);
		
		sc.close();

	}
	
}


