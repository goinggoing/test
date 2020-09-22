package codeUP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//기숙사 생활을 하는 학교에서 어떤 금요일(전원 귀가일)에는 모두 집으로 귀가를 한다.
//
//오랜만에 집에 간 영일이는 아버지와 함께 두던 매우 큰 오목에 대해서 생각해 보다가
//"바둑판에 돌을 올린 것을 프로그래밍 할 수 있을까?"하고 생각하였다.
//
//바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
//n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.

public class Code_1096 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("바둑판에 올려놓을 흰 돌 개수: ");
		int num = sc.nextInt();
		int[][] arr = new int[19][19];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j]=0;
			}
		} //바둑판 o으로 초기화
		
		System.out.println("바둑알이 올려진 좌표 ");
		for(int i=0; i<num; i++) {
			arr[sc.nextInt()-1][sc.nextInt()-1] = 1;
		} //흰돌 올려놓기
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} //바둑판 출력
		sc.close();
	
	}
}
