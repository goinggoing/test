package codeUP;

import java.util.Scanner;

//온라인 채점시스템에는 초등학생, 중고등학생, 대학생, 대학원생,
//일반인, 군인, 프로그래머, 탑코더 등 아주 많은 사람들이 들어와 문제를 풀고 있는데,
//
//실시간 채점 정보는 메뉴의 채점기록(Judge Status)을 통해 살펴볼 수 있다.
//
//자! 여기서...잠깐..
//같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
//매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
//
//예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
//한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.

public class Code_1092 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("세 사람의 방문주기 입력: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		sc.close();
		
		int count =1;
		
		//num1, num2, num3 셋 모두 나머지가 0일 때 종료(세 사람의 방문날짜가 같은 날)
		while(count % num1 != 0 || count % num2 != 0 || count % num3 != 0) {
			count++;
		}
		System.out.println(count);
		
	}
}
