package codeUP;

import java.util.Scanner;

//정수가 순서대로 입력된다.
//-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
//
//0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
//while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.
//참고
//goto 명령문을 사용하면 간단한 반복 실행을 만들 수 있다.
//반복 실행 부분을 빠져나오기 위해(즉 무한 반복을 방지하기 위해)
//반복 실행 되는 도중에 조건을 검사해야 한다.

public class Code_1071 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수 입력: ");
		
		int num;
		boolean check = true; //while문의 제어변수 check를 true로 선언
		
		while(check) {
			num = sc.nextInt(); 
			
			if(num == 0) {
				check = false;
			} else {
				System.out.println(num);
			}
		}
		sc.close();
		
	}
}
