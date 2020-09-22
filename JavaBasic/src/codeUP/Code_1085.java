package codeUP;

import java.util.Scanner;

//소리 파일 저장용량 계산하기
//h, b, c, s 가 공백을 두고 입력된다.
//h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

public class Code_1085 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("h,b,c,s 입력: ");
		
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		double total = 0;
		
		sc.close();
		
		if(h > 0 && h <= 48000 &&
				b > 0 && b <= 32 && b % 8 == 0 &&
				c > 0 && c <= 5 &&
				s > 0 && s <= 6000) {
			total = h*b*c*s;
		}
		
		double result = ((total/8)/Math.pow(2, 10))/Math.pow(2, 10);
		System.out.printf("%.1f MB", result);
		

	}
}
