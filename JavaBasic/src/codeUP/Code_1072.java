package codeUP;

import java.util.Scanner;

//n개의 정수가 순서대로 입력된다.
//-2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
//
//n개의 입력된 정수를 순서대로 출력해보자.

public class Code_1072 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("정수의 개수 입력: ");
		int count = sc.nextInt();
		
		int num;
		for(int i=0; i<count;i++) {
			num = sc.nextInt();
			System.out.println(num);
		}
		sc.close();
		
	}
}
