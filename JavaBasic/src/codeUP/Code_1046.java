package codeUP;

import java.util.Scanner;

//정수 3개를 입력받아 합과 평균을 출력해보자.
//단, -2147483648 ~ +2147483647


public class Code_1046 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		//int형의 범위 체크를 위한 예외 처리
		try { //int형 범위 내
			System.out.println("정수 3개 입력: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			sc.close();
			
			int sum = num1 + num2 + num3;
			double avg = (double)sum/3;
			
			System.out.println(sum);
			System.out.println(String.format("%.1f", avg));
			
		} catch (Exception e) { //int형 범위 밖
			System.out.println("범위 안의 정수를 입력하세요.");
		}

	}
}
