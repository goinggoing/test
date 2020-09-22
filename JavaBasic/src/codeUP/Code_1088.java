package codeUP;

import java.util.Scanner;

//1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
//3의 배수인 경우는 출력하지 않도록 만들어보자.
//
//예를 들면,
//1 2 4 5 7 8 10 11 13 14 ...
//와 같이 출력하는 것이다.

public class Code_1088 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수 입력: ");
		
		int num = sc.nextInt();
		
		sc.close();
		
		for(int i=0; i<=num; i++) {
			if(i % 3 == 0) {
				System.out.print("");
			} else {
				System.out.print(i + " ");
			}
		}

	}
}
