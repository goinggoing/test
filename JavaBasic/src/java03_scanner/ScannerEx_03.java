package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		//Scanner를 이용하여 char입력 처리하기
		
		Scanner sc = new Scanner(System.in); //입력객체
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); //문자열 입력받아 str에 저장
		
		System.out.println("입력한 문자열 : " + str);
		
		char ch = str.charAt(0);
		System.out.println("0번째 단일문자 : " + ch);
		
		System.out.println("----------");
		System.out.print("성별 입력하세요 : ");

		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
		
		System.out.println("입력한 성별 : " + gender);
		
		
	}
}










