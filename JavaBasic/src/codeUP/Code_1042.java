package codeUP;

import java.util.Scanner;

//정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
//단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.

public class Code_1042 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		boolean run = true; //while문을 제어하기 위한 변수
		
	//범위 밖의 값을 입력했을 때를 위한 예외처리
	try {
			
		while(run) { //범위 내의 값 입력
			
			System.out.println("첫 번째 정수 입력: ");
			int num1 = sc.nextInt();
			
			System.out.println("두 번째 정수 입력: ");
			int num2 = sc.nextInt();
			
			if(num2 == 0) { //num2가 0이면
				System.out.println("나누는 수는 0이 될 수 없습니다.");
				//while문 반복
			} else { //num2가 0이 아니면
				int result = num1 / num2;
				System.out.println(result);
				run = false; //while문 종료
			}
			
		} //end while
		
	} catch (Exception e) { //범위 밖의 값 입력
		System.out.println("범위 밖의 정수를 입력했습니다.");
	}
	sc.close();
	
	}
}
