package codeUP;

import java.util.Scanner;

//주민번호 입력받아 형태 바꿔 출력하기

public class Code_1020 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민번호를 입력하세요: ");
		String a = sc.next();
		String[] arr = a.split("\\-");
		System.out.printf("%s%s", arr[0], arr[1]);

	}

}
