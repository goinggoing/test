package codeUP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//부모님을 기다리던 영일이는 검정/흰 색 바둑알을 바둑판에 꽉 채워 깔아 놓고 놀다가...
//
//"십(+)자 뒤집기를 해볼까?"하고 생각했다.
//
//바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
//n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.

public class Code_1097 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
	
		int[][] pan = new int[19][19];
		
		for(int i=0; i<pan.length; i++) {
			for(int j=0; j<pan[i].length; j++) {
				pan[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("십자 뒤집기 횟수: ");
		int num = sc.nextInt();
		int x = 0, y = 0;
		
		System.out.println("십자 뒤집기할 좌표 ");
		for(int n=0; n<num; n++) {
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
		
		
		for(int i=0; i<pan.length; i++) {
			for(int j=0; j<pan[i].length; j++) {
				if(i == x || j == y) { // i가 x인 모든 데이터, j가 y인 모든 데이터
					if(i == x && j == y) { //입력한 좌표의 값은 그대로 저장
						pan[i][j] = pan[i][j];
					} else if(pan[i][j] == 0) { //입력한 좌표를 제외한 데이터 중 값이 0이면
						pan[i][j] = 1;
					} else { //입력한 좌표를 제외한 데이터 중 값이 1이면 0으로 저장
						pan[i][j] = 0;
					}
				}
				
			}
		}
		}
		
		for(int i=0; i<pan.length; i++) {
			for(int j=0; j<pan[i].length; j++) {
				System.out.print(pan[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
		
}
