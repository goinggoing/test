package codeUP;

import java.util.Scanner;

//실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

public class Code_1023 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("실수를 입력하세요: ");
		double dNum = sc.nextDouble();
		
		sc.close();
		
		String[] arr = String.valueOf(dNum).split("\\."); // '.'을 기준으로 분할하여 배열에 저장
		
		for(String a: arr) {
			System.out.println(a); //arr배열의 값을 출력
		}
		
	}
}
