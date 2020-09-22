package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//학생 정보 관리 프로그램
	//	이름, 나이, 성별, 국어, 영어, 수학
	//	6가지 정보를 저장할 수 있는 변수를 만들고
	//	총점과 평균을 포함한 결과를 출력한다
	
//동작 예시)
//Input Name : Alice
//Input Age : 33
//Input Gender : F
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== 출력 =====
//이름	나이	성별	국어	영어	수학	총점	평균
//Alice	33		F		100		99		97		296		98.666666667
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); //표준입력객체
		
		System.out.print("이름 입력하세요 : ");
		String name = in.nextLine();
//		System.out.println("[TEST] name : " + name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = in.nextInt();
//		System.out.println("[TEST] age : " + age);

		in.nextLine(); //버퍼 비우기 (버퍼에 남아있는 개행문자 제거)
		
		System.out.print("성별을 입력하세요 : ");
//		String gender = in.nextLine();
//		System.out.println("[TEST] gender : " + gender);

		String str = in.nextLine();
		char gender = str.charAt(0);
//		System.out.println("[TEST] gender : " + gender);

		System.out.print("국어 점수 입력 : ");
		int kor = in.nextInt();
//		System.out.println("[TEST] kor : " + kor);

		System.out.print("영어 점수 입력 : ");
		int eng = in.nextInt();
//		System.out.println("[TEST] eng : " + eng);

		System.out.print("수학 점수 입력 : ");
		int math = in.nextInt();
//		System.out.println("[TEST] math : " + math);

		
		int sum = kor + eng + math; //총점
//		System.out.println("[TEST] sum : " + sum);
		
		double avg = sum / (double)3; //평균
//		System.out.println("[TEST] avg : " + avg);
		
		// ----- 테스트완료 -----
		// 탭 : '\t'
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		System.out.println(
				name + '\t' + age + '\t' + gender + '\t'
				+ kor + '\t' + eng + '\t' + math + '\t'
				+ sum + '\t'
				+ Math.round(avg*100)/(double)100 );
		
		// Math.round(avg*100)/(double)100
		//	소수점 둘째자리까지 출력이 되도록 연산
		
	}
}














