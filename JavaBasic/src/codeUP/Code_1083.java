package codeUP;

import java.util.Scanner;

//3 6 9 게임을 하던 영일이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
//3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
//
//참고
//중첩의 원리
//반복 실행 구조 안에 선택 실행 구조를 자유롭게 중첩할 수 있다.
//10 보다 작은 정수 1개가 입력된다.
//(1 ~ 9)

public class Code_1083 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수 1개 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i=1; i <= num; i++) {
			if(i%3 == 0) {
				System.out.print("X ");
			} else {
				System.out.print(i + " ");
			}
		}
		
	}
}
