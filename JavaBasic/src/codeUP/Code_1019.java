package codeUP;

import java.util.Scanner;

//년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자

public class Code_1019 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요: ");
		String date = sc.next();
		String[] arr = date.split("\\.");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		int C = Integer.valueOf(arr[2]);
		System.out.printf("%04d.%02d.%02d", A, B, C);

	}
}