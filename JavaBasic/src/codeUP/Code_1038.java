package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
//(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)

public class Code_1038 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long sum = Long.parseLong(st.nextToken())+Long.parseLong(st.nextToken());
		System.out.println(sum);
		
//		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
//		
//		System.out.println("첫 번째 정수 입력: ");
//		
//		long num1 = sc.nextLong(); //정수 입력
//		long num2 = 0;
//		
//		if(num1 < -1073741824 || num1 > 1073741824) { // num1이 범위 밖
//			System.out.println("범위 안의 정수를 입력하세요.");
//		} else { //num1이 범위 내
//			
//			System.out.println("두 번째 정수 입력: ");
//			num2 = sc.nextLong();
//		
//			if(num2 < -1073741824 || num2 > 1073741824) {//num2가 범위 밖
//				System.out.println("범위 안의 정수를 입력하세요.");
//			} else { //num2가 범위 내
//				sc.close();//입력 종료 후 객체닫기
//				
//				long sum = num1 + num2; //합 저장
//				System.out.println(sum); //두 정수의 합출력
//			}
//			
//		}
			
	}
}
