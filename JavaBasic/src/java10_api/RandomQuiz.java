package java10_api;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
	
	public static final int SCISSORS = 1; //가위
	public static final int ROCK = 2; //바위
	public static final int PAPER = 3; //보
	
	public static void main(String[] args) {
		
		// 가위바위보 게임 만들기
		
		// int user : 사용자입력 (1~3)
		// int com : 컴퓨터 랜덤 (1~3)
		
		// 1 : 가위, 2 : 바위, 3 : 보
		
		// I. Random을 이용하여 com에 값 저장
			// com 값을 출력
		// II. user에 입력받기
		// III. com, user 비교 (가위바위보 승부)
		// IV. 결과 출력 (승자)
		
		// V. I~IV 반복..
		
		Scanner sc = new Scanner(System.in); // 입력객체 - 사용자
		Random ran = new Random(); // 랜덤객체 - 컴퓨터
		
		int user; //사용자의 입력값
		int com; //컴퓨터의 랜덤값
		
		while(true) {
			com = ran.nextInt(3)+1; //1~3의 랜덤
	//		System.out.println("[TEST] com : " + com);
			
			do {
				System.out.print("가위바위보 입력(1~3) [0:종료] : ");
				user = sc.nextInt();
				
				if( user == 0 ) {
					return; //메인메소드 중단 -> 프로그램 종료
				}
			} while( user<1 || user>3 );
			
			System.out.println("com : " + com + ", " + toHangul(com));
			System.out.println("user : " + user + ", " + toHangul(user));
			
			System.out.print("\n\t>> ");
			if( user==com ) { //비김
				System.out.println("비김");
			} else {
				if( user==SCISSORS ) { //사용자: 가위
					if( com==ROCK )	System.out.println("컴퓨터 승");
					else if( com==PAPER )	System.out.println("사용자 승");
					
				} else if( user==ROCK ) { //사용자: 바위
					if( com==SCISSORS )	System.out.println("사용자 승");
					else if( com==PAPER )	System.out.println("컴퓨터 승");
						
				} else if( user==PAPER ){ //사용자: 보
					if( com==SCISSORS )	System.out.println("컴퓨터 승");
					else if( com==ROCK )	System.out.println("사용자 승");
						
				} // if end (가위바위보 승부)
			} // if end (비김)
		} // while end (무한루프)
	} // main end
	
	//전달받은 숫자를 문자열로 반환 (1:가위, 2:바위, 3:보)
	public static String toHangul(int num) {
		if(num == 1) {
			return "가위";
		} else if(num == 2) {
			return "바위";
		} else {
			return "보";
		}
	}
}




















