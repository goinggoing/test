package codeUP;

import java.util.Scanner;

//정수를 1개 입력받아 1만큼 더해 출력해보자.
//단, -2147483648 ~ +2147483647 의 범위로 입력된다.
//
//주의
//계산되고 난 후의 값의 범위(데이터형)에 주의한다.

public class Code_1044 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 1개 입력: ");
		int num = sc.nextInt(); //정수 입력
		long result = (long)num + 1; //num을 long형으로 캐스팅
		
		sc.close();
		
		System.out.println(result); //result 출력
	}
}
