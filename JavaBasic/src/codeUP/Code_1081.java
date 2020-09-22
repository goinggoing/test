package codeUP;

import java.util.Scanner;

//1부터 n까지, 1부터 m까지 숫자가 적힌
//서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
//주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
//단, n, m은 10이하의 자연수

public class Code_1081 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("자연수 2개 입력: ");
		int n = sc.nextInt();
		
		if(n > 0 && n <= 10) { //n이 범위 안인 경우
			int m = sc.nextInt();
			sc.close();
			
			if(m > 0 && m <= 10) { //m이 범위 안인 경우
				for(int i=1; i<=n; i++) {
					for(int j=1; j<=m; j++) {
						System.out.println(i + "" + j);
						System.out.println();
					}
				}
				
			} else { //m이 범위 밖인 경우
				System.out.println("입력 범위를 확인하세요(10이하의 자연수)");
			}
			
		} else { //n이 범위 밖인 경우
			System.out.println("입력 범위를 확인하세요(10이하의 자연수)");
			
		}

		
	}
}
