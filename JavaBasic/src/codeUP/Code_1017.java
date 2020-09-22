package codeUP;

import java.util.Scanner;

//int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자

public class Code_1017 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");
		int a = sc.nextInt();

		System.out.printf("%d %d %d", a, a, a);

	}
}
