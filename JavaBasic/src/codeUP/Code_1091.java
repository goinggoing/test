package codeUP;

import java.util.Scanner;

//시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
//n번째 수를 출력하는 프로그램을 만들어보자.

public class Code_1091 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("a, m, d, n 입력: ");
		
		long a = sc.nextInt(); //시작값
		int m = sc.nextInt(); //곱할값
		int d = sc.nextInt(); //더할값
		int n = sc.nextInt(); //몇 번째인지
		sc.close();
		
		for(int i=1; i<n; i++) {
			a = a * m + d;
		}
		System.out.println(a);
	}
}
