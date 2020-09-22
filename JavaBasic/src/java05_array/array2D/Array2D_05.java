package java05_array.array2D;

import java.util.Scanner;

public class Array2D_05 {
	public static void main(String[] args) {

		//new
		//	동적 할당 연산자
		
		//정적할당
		//동적할당
		//	할당 : 변수공간 생성(저장공간 생성)
		
		//	정적 : 실행 전, Compile-time
		//	동적 : 실행 후, 동작 중, Run-time
		
		int num; //int형 변수 선언 -> 정적 할당
		
		int[] arr; //int형 배열 변수 선언 -> 정적 할당
		arr = new int[5]; //int[5] 배열 생성 -> 동적 할당
		
		//-----------------------------------------
		
//		int[] arr2 = new int[-5];
		// 배열의 선언과 동시에 생성하는 코드는
		//변수의 선언과 배열의 생성을 한번에 작성하지만
		//실제 동작하는 시점은 다르다(정적할당, 동적할당) 
		
		//-----------------------------------------
		
		int[][] arr3 = new int[3][];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr3.length; i++) {
			System.out.print(i+"행 배열의 크기는? ");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}
	}
}













