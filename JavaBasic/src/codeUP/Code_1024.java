package codeUP;

import java.util.Scanner;

//단어를 1개 입력받는다.
//입력받은 단어(영어)의 각 문자를
//한줄에 한 문자씩 분리해 출력한다.

public class Code_1024 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("단어를 입력하세요: ");
		String word = sc.next();
		sc.close();
		
		
		int len = word.length();
		char[] arr = new char[len]; //문자배열 생성
		
		for(int i=0; i<len; i++) {
			arr[i] = word.charAt(i); //입력받은 단어를 문자 하나씩 배열에 저장
		}
		
		// 방법 2 : toCharArray() 메소드 사용
//		char[] arr = sc.next().toCharArray();

		for(char c : arr) {
			System.out.println("'" + c + "'"); //출력형식에 맞춰 문자 출력
		}
		
	}
}
