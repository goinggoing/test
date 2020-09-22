package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_02 {

//	 + 세수를 입력 받아 가장 큰 수를 출력하시오
//
//	 + 두수를 입력 받아 합이 짝수이고
//	  3의 배수인지 판별하시오
//
//	 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//	  평균이 90이상이면 “A”, 80이상이면 “B”,
//	  70 이상이면 “C”, 60 이상이면 “D”,
//	  60미만이면 “F”를 출력하시오.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		 + 세수를 입력 받아 가장 큰 수를 출력하시오
	
//		System.out.print("Input Number1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2 : ");
//		int num2 = sc.nextInt();
//		System.out.print("Input Number3 : ");
//		int num3 = sc.nextInt();
////		System.out.println("[TEST] num1="+num1+",num2="+num2+",num3="+num3);
//		
//		int max = 0; //가장 큰 값 저장
//	
//		//num1과 num2 중 큰 숫자를 max에 저장
//		if( num1>=num2 ) {
//			max = num1;
//		}
//		if( num2>num1 ) {
//			max = num2;
//		}
//		
//		//max보다 num3가 클 경우에만 max에 num3를 저장
//		if( num3>max ) {
//			max = num3;
//		}
//		
//		System.out.println("세 숫자 중 가장 큰 수는 " + max);
		
		
		// -------------------------------------------------------
		
//		 + 두수를 입력 받아 합이 짝수이면서
//		  3의 배수인지 판별하시오
		
//		System.out.print("Input Number1 : ");
//		int num1 = sc.nextInt();
//		System.out.print("Input Number2 : ");
//		int num2 = sc.nextInt();
//
//		int sum = num1+num2; //합계
//		
//		if( sum%2==0 && sum%3==0 ) {
//			System.out.println("두 수의 합이 짝수이면서 3의 배수");
//		}
//		
////		if( !(sum%2==0 && sum%3==0) ) {
//		if( sum%2!=0 || sum%3!=0 ) {
//			System.out.println(
//					"두 수의 합이 짝수가 아니고 또는 3의 배수가 아님");
//		}

		// -----------------------------------------------------
		
//		 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//		  평균이 90이상이면 “A”, 80이상이면 “B”,
//		  70 이상이면 “C”, 60 이상이면 “D”,
//		  60미만이면 “F”를 출력하시오.
		
		System.out.print("Input Score1 : ");
		int score1 = sc.nextInt();
		System.out.print("Input Score2 : ");
		int score2 = sc.nextInt();
		System.out.print("Input Score3 : ");
		int score3 = sc.nextInt();

		int sum = score1 + score2 + score3; //합계
		double avg = sum / (double)3; //평균
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		if( avg>=90 ) {
			System.out.println("A");
		}
		if( avg>=80 && avg<90 ) {
			System.out.println("B");
		}
		if( avg>=70 && avg<80 ) {
			System.out.println("C");
		}
		if( avg>=60 && avg<70 ) {
			System.out.println("D");
		}
		if( avg<60 ) {
			System.out.println("F");
		}
		
	}
}












