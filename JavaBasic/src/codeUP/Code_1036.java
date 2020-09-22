package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.

public class Code_1036 {
	public static void main(String[] args) throws IOException {
		
		//방법2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(br.read());
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("문자 입력: ");
		char c = sc.nextLine().charAt(0); //문자 하나 입력
		sc.close();
		
		System.out.println((int)c); //출력형식에 맞게 출력
	}
}
