package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_01 {
	public static void main(String[] args) {
		
		//----- 상수 선언 -----
		//고정으로 사용하는 값
		final int FLOOR = 9; //건물의 층수
		final int FEE = 12000; //인당 관리비
		//--------------------
		
		//----- 변수 선언 -----
		int[] people = new int[FLOOR+1]; //각 층 인원 + 총 인원
		int[] expense = new int[FLOOR+1]; //각 층 관리비 + 총 관리비
		
		Scanner sc = new Scanner(System.in); //입력 객체
		//------------------------------
		
		//----- 인원 입력 -----
		System.out.println("- - - 각 층의 인원 입력 - - -");
		for( int i=0; i<FLOOR; i++ ) { //i, 0 ~ FLOOR-1
			System.out.print(" >> "+(i+1)+"층의 인원은? ");
			people[i] = sc.nextInt(); //각 층의 인원 입력
			
			people[FLOOR] += people[i];
		}
		
		//TEST
//		for(int i=0; i<people.length; i++) {
//			System.out.println(people[i]);
//		}
		//--------------------
		
		//----- 관리비 계산 -----
		for(int i=0; i<expense.length; i++) {
			expense[i] = people[i] * FEE; //각 층 관리비와 총 관리비 계산
		}
		//TEST
//		for(int i=0; i<expense.length; i++) {
//			System.out.println(expense[i]);
//		}
		//-------------------------

		//----- 마무리 출력 -----
		System.out.println();
		System.out.println("- - - 각 층의 관리비 출력 - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.println(" >> "+(i+1)+"층의 관리비는 "+expense[i]+"원 입니다");
		}
		
		System.out.println();
		System.out.println("총 인원은 " + people[FLOOR] + "명 입니다");
		System.out.println("총 관리비는 " + expense[FLOOR] + "원 입니다");
		//-------------------------
	}
}












