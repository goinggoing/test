package codeUP;

import java.util.Scanner;

//실수 1개 입력받아 그대로 출력하기

public class Code_1012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요: ");
		
		float fl = sc.nextFloat();
		
		long a = System.currentTimeMillis();
		System.out.printf("입력한 값: %f", + fl);
		long b = System.currentTimeMillis();
		System.out.println(b-a);
		
		System.out.println("입력한 값 : "+fl);
		
		sc.close();

	}
	
}


