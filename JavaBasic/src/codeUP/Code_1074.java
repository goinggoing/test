package codeUP;

import java.util.Scanner;

//정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.

public class Code_1074 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		while(num != 0) {
			System.out.println(num);
			num--;
		}
		sc.close();
	}
}
