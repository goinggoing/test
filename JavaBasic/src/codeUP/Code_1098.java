package codeUP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//부모님과 함께 유원지에 놀러간 영일이는
//설탕과자(설탕을 녹여 물고기 등의 모양을 만든 것) 뽑기를 보게 되었다.
//
//길이가 다른 몇 개의 막대를 바둑판과 같은 격자판에 놓는데,
//
//막대에 있는 설탕과자 이름 아래에 있는 번호를 뽑으면 설탕과자를 가져가는 게임이었다.
//(잉어, 붕어, 용 등 여러 가지가 적혀있다.)
//격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
//막대를 놓는 방향(d:가로는 0, 세로는 1)과
//막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,
//
//격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.

public class Code_1098 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		int length = 0, direct = 0, x = 0, y = 0;
		
		System.out.print("가로 및 세로 입력: ");
		int width = sc.nextInt();
		int height = sc.nextInt();
		int[][] arr = new int[width][height];
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				arr[i][j] = 0;
			}
		} //주어진 가로와 세로에 따라 격자판 초기화
		
		System.out.print("격자판에 놓을 막대의 수: ");
		int Input = sc.nextInt(); //for문을 반복할 횟수
		for(int i=0; i<Input; i++) {
			System.out.print("막대의 길이, 방향, x좌표, y좌표: ");
			length = sc.nextInt();
			direct = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();
			
			if(direct == 0) { //막대의 방향이 가로일떄(행은 그대로,열만 변경)
				for(int j=y-1; j<y-1+length; j++) {
					arr[x-1][j] = 1;
				}
			} else { //막대의 방향이 세로일때 (행만변경, 열은 그대로)
				for(int j=x-1; j<x-1+length; j++) {
					arr[j][y-1] = 1;
				}
				
			} //입력된 정보대로 막대놓기
			
		} //for문을 통해 추가적인 정보 입력
		
		for(int i=0; i<width; i++) {
			for(int j=0; j<height; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		} //막대가 놓인 격자판 출력
		
		sc.close();
	}	
}
