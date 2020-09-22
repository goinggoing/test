package codeUP;

import java.util.Scanner;

//8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
//
//참고
//%o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
//%d로 출력하면 10진수로 출력된다.

public class Code_1034 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("10진수로 변환할 8진수 정수 입력하세요: ");
		int num = sc.nextInt(8); //8진수 정수 입력
		sc.close();
		
		System.out.printf("%d", num); //출력형식에 맞게 출력
	}
}
