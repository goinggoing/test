package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //입력객체

		System.out.println("--- 입력 ---");
		// 입력버퍼 문제 발생지점
		System.out.print("Input Number : ");
		int num = sc.nextInt();

//		sc.nextLine(); //입력버퍼의 개행문자 제거하기
		sc.skip("\r\n"); //입력버퍼에서 개행문자 제거하기
		
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);

	}
}










