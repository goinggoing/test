package codeUP;

import java.util.Scanner;

//정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.

public class Code_1078 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i=0; i<=num; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
