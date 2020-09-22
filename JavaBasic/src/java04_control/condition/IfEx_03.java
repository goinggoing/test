package java04_control.condition;

import java.util.Scanner;

public class IfEx_03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input = in.nextInt();
		
		if( input == 10 ) {
			System.out.println("입력값은 10입니다");
		}
		
		if( input != 10 ) {
			System.out.println("입력값은 10이 아닙니다");
		}
		
		if( input>=1 && input<=100 ) {
			System.out.println("입력한 값은 1~100 사이의 정수");
		}
		
	}
}














