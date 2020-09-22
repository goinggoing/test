package java06_class.manage;

import java.util.Scanner;

// 학생 정보 관리 클래스
public class StudentService {

	private Student stu; //학생 정보
	private Scanner input; //표준입력객체
		
	// --- constructor ---
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}
	// -------------------

	// --- method---
	
	// 학생 인적정보 입력 - 이름, 나이
	public void insertInfo() {
		System.out.println(" + + + 인적 정보 입력 + + +");
		System.out.print("  >> 이름은? ");
		stu.setName( input.nextLine() );

		System.out.print("  >> 나이는? ");
		stu.setAge( input.nextInt() );
	}
	
	// 학색 3과목 성적 입력 기능
	public void insertScore() {
		System.out.println(" + + + 점수 입력 + + +");
		System.out.print("  >> 국어점수는? ");
		stu.setKor( input.nextInt() );
		System.out.print("  >> 영어점수는? ");
		stu.setEng( input.nextInt() );
		System.out.print("  >> 수학점수는? ");
		stu.setMath( input.nextInt() );
		
		calcSum();
		calcAvg();		
	}
	
	// 학생의 총점 계산
	private void calcSum() { 
		stu.setSum( stu.getKor()+stu.getEng()+stu.getMath() );
	}
	
	// 학생의 평균 계산
	private void calcAvg() {
		stu.setAvg( stu.getSum() / (double)3 );
	}
	
	public void printStu() {
		System.out.println(
			"이름\t나이\t국어\t영어\t수학\t총점\t평균");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
			stu.getName(), stu.getAge(),
			stu.getKor(), stu.getEng(), stu.getMath(),
			stu.getSum(), stu.getAvg() );

//		System.out.print(stu.getName() + "\t"
//				 + stu.getAge() + "\t"
//				 + stu.getKor() + "\t"
//				 + stu.getEng() + "\t"
//				 + stu.getMath() + "\t"
//		 		 + stu.getSum() + "\t");
//		System.out.printf("%.2f", stu.getAvg());
//		System.out.println();
	}
	// -------------
	
}











