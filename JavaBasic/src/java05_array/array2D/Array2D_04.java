package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {
	public static void main(String[] args) {
		
		//1~3학년
		//2개반
		//4명의 학생
		//3과목
		//점수
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] sco1 = new int[2][4][3];
		int[][][] sco2 = new int[2][4][3];
		int[][][] sco3 = new int[2][4][3];
		
		// -----------------------------------------------
		
		// 2명의 국어, 영어, 수학 점수를 저장하는 배열
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //2명의 총점 배열
		double[] avg = new double[2]; //2명의 평균 배열
		
		// --- 2명의 학생들의 3과목 점수 입력받기 ---
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"국어", "영어", "수학"};
		for(int i=0; i<sco.length; i++) { // i번째 학생
			for(int j=0; j<sco[i].length; j++) { // j번째 과목
				System.out.print( (i+1) + "번 학생의 " + subject[j] + " 점수 : " );
				sco[i][j] = sc.nextInt();
			}
			System.out.println(); //학생들 점수 입력 사이에 줄 바꿈(개행)
		}
		// ------------------------------------------
//		//TEST
//		for(int i=0; i<sco.length; i++) { // i번째 학생
//			for(int j=0; j<sco[i].length; j++) { // j번째 과목
//				System.out.print(sco[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// --- 총점 계산하기 ---
		for(int i=0; i<sum.length; i++) { // i번째 학생
			for(int j=0; j<sco[i].length; j++) { //j번째 과목
				sum[i] += sco[i][j];
			}
		}
		// ---------------------
//		// TEST
//		for(int i=0; i<sum.length; i++) { // i번째 학생
//			System.out.print(sum[i] + " ");
//		}
//		System.out.println();
		
		// --- 평균 계산하기 ---
		for(int i=0; i<avg.length; i++) { // i번째 학생
			avg[i] = sum[i] / (double)3;
		}
		// ---------------------
//		//TEST
//		for(int i=0; i<avg.length; i++) { // i번째 학생
//			System.out.print(avg[i] + " ");
//		}
//		System.out.println();
		
		// --- 종합 출력 ---
		//	ex)	번호	국어	영어	수학	총점	평균
		//		1번		xxx		xxx		xxx		xxx		xxx
		//		2번		xxx		xxx		xxx		xxx		xxx
		// -----------------
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<sco.length; i++) { //i번째 학생
			System.out.print(i+1 + "번"); //번호 출력
			
			for(int j=0; j<sco[i].length; j++) { //3과목 점수 출력
				System.out.print("\t" + sco[i][j]);
			}
			
			System.out.print("\t" + sum[i]); //총점 출력
			
			System.out.println("\t" + avg[i]); //평균 출력
		}
	}
}












