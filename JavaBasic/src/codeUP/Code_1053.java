package codeUP;

import java.util.Scanner;

//1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
//반대로 출력하는 프로그램을 작성해보자.
//정수 1개가 입력된다.(단, 0 또는 1 만 입력된다.)
//입력된 값이 0이면 1, 1이면 0을 출력한다.

public class Code_1053 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 1개 입력(0,1): ");
		int a = sc.nextInt();
		sc.close();
		
		if(a == 0) { //a가 0이면 
			a = 1;
		} else { 
			a = 0;
		}
		
		System.out.println(a);
	}
}
