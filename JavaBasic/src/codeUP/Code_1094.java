package codeUP;

import java.util.Scanner;

//정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
//
//학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
//영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.
//
//출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
//
//
//참고
//배열에 순서대로 기록해 두고, 기록된 내용을 거꾸로 출력하면 된다.

public class Code_1094 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("출석번호 부른 횟수 입력: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		
		System.out.print("출석 부른 번호: ");
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		} //array 초기화
		
		for(int i=0; i<array.length/2; i++) {
			int temp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
		} //array정렬
		
		for(int i: array) {
			System.out.print(i + " ");
		} //array 출력
		sc.close();
			
	}
}
