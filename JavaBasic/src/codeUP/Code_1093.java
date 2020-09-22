package codeUP;

import java.util.Scanner;

//정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
//
//선생님은 출석부를 보고 번호를 부르는데,
//학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부른다.
//
//그리고 얼굴과 이름이 잘 기억되지 않는 학생들은 번호를 여러 번 불러
//이름과 얼굴을 빨리 익히려고 하는 것이다.
//
//출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
//첫 번째 줄에 출석 번호를 부른 횟수인 정수 n이 입력된다. (1 ~ 10000)
//두 번째 줄에는 무작위로 부른 n개의 번호(1 ~ 23)가 공백을 두고 순서대로 입력된다.

public class Code_1093 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("출석번호 부른 횟수 입력: ");
		int n = sc.nextInt();
		int[] numArr = new int[n];
		int[] printArr = new int[23];
		
		System.out.println("무작위 번호 부르기: ");
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = sc.nextInt();
		} //불린 번호들을 배열에 저장
		
		for(int i=0; i<printArr.length; i++) {
			printArr[i] = 0;
		} //printArr 배열 초기화
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=1; j<=printArr.length; j++) {
				if(numArr[i]==j) {
					printArr[j-1]++;
				}
			}
		} //불린 횟수만큼 값 증가
		
		for(int i: printArr) {
			System.out.print(i + " ");
		} //배열 출력
		
		sc.close();
	}
}
