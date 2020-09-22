package codeUP;

import java.util.Scanner;

//정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
//단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.

public class Code_1043 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		boolean run = true; //while문을 제어하기 위한 변수
		
	//int형의 범위만 허용
	try {
			
		while(run) { //범위 내의 값 입력
			
			System.out.println("첫 번째 정수 입력: ");
			int num1 = sc.nextInt();
			
			if(num1 >= 0 && num1 <= 2147483647) { //num1이 조건에 참
				System.out.println("두 번째 정수 입력: ");
				int num2 = sc.nextInt();
				
				if(num2 >= 0 && num2 <= 2147483647 && num2 != 0) {
					int result = num1 % num2;
					System.out.println(result);
					run = false; //while문 종료
				} else { //num2가 조건에 거짓
					System.out.println("조건에 맞지 않는 정수입니다.");
				}
				
			} else { //num1이 조건에 거짓
				System.out.println("다시 입력하세요");
			}
			
		} //end while
		
	} catch (Exception e) { //범위 밖의 값 입력
		System.out.println("int형 범위 밖의 정수를 입력했습니다.");
	}
	sc.close();
	
	}
}
