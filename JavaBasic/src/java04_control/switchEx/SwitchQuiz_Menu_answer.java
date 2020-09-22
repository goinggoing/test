package java04_control.switchEx;

import java.util.Scanner;

public class SwitchQuiz_Menu_answer {
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성
	
	public static void main(String[] args) {
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		Scanner sc = new Scanner(System.in); //입력객체
		
		int select; //메뉴 선택 변수
		
		System.out.println("===============================");
		System.out.println("\tM  e  n  u");
		System.out.println("===============================");
		System.out.println("\t1. Hello World 출력");
		System.out.println("\t2. 이름 출력");
		System.out.println("\t3. 성별 출력");
		System.out.println("\t4. 종료");
		System.out.println("===============================");
		
		System.out.println();
		System.out.print("\t>> ");
		
		select = sc.nextInt();
		
		System.out.print("\n\t>>");
		switch(select) {
		case HELLO_MENU: //Hello World 출력
			System.out.println("Hello World");
			break;
		
		case GENDER_MENU: //성별 출력
			System.out.println("Female");
			break;
			
		case NAME_MENU: //이름 출력
			System.out.println("Alice");
			break;
			
		case EXIT_MENU: //종료
			System.out.println("Good Bye~");
			break;
			
		default:
			System.out.println("잘못된 메뉴를 선택했습니다");
		}
		
	}
}














