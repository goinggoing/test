package codeUP;

import java.util.Scanner;

//그림 파일 저장용량 계산하기

public class Code_1086 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("w,h,b 입력: ");
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		double cal = Math.pow(2, 23); //bit를 mb로 변환하기 위한 변수
		double total = w*h*b; //필요한 총 저장공간  bit수
		double result = total/cal; //bit를 mb로 변환
				
		System.out.println(String.format("%.2f MB", result));

	}
}
