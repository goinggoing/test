package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
//	 + 삼각형넓이 구하기
//	  - 삼각형넓이 = (밑변 * 높이)/2
//	  - 밑변과 높이를 입력받아 계산
	
	public static void main(String[] args) {
		
		//자동 import 최적화 단축키
		//	ctrl + shift + o
		
		//입력 객체
		Scanner in; //Scanner 입력 객체 변수 선언
		in = new Scanner(System.in); //Scanner 입력 객체 생성
		
		
		System.out.print("높이를 입력하세요 : ");
		int height = in.nextInt(); //높이 변수
//		System.out.println("[TEST] height : " + height);
		

		System.out.print("밑변을 입력하세요 : ");
		int base = in.nextInt(); //밑변 변수
//		System.out.println("[TEST] base : " + base);

		
		//넓이 변수
		double area = height * base / (double)2;
//		System.out.println("[TEST] 넓이 : " + area);
		
		System.out.println(); //개행, 줄바꿈
		System.out.println("--- 결 과 ---");
		System.out.println(" 밑변 : " + base);
		System.out.println(" 높이 : " + height);
		System.out.println(" 넓이 : " + area);
	}
}











