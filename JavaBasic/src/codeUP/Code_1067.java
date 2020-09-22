package codeUP;

import java.util.Scanner;

//정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.

public class Code_1067 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		
		System.out.println("정수 1개 입력: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num < 0) { //입력 정수가 음수이면
			System.out.println("minus");
			if(num%2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			
		} else if (num > 0) { //입력 정수가 양수이면
			System.out.println("plus");
			if(num%2 == 0 ) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
			
		} else { //정수가 0인 경우
			System.out.println("0이며 even도 odd도 아닙니다.");
		}
		
	}
}
