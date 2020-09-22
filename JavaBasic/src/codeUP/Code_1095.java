package codeUP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//정보 선생님은 오늘도 이상한 출석을 부른다.
//
//영일이는 오늘도 다른 생각을 해보았다.
//출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?
//
//출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
//
//
//참고
//배열에 순서대로 기록해 두면, 기록된 내용을 모두 검사해 가장 작은 값을 찾아내면 된다.
//
//그런데, 가장 작은 값은 어떻게 어떤 것과 비교하고 찾아야 할까?

public class Code_1095 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.print("출석번호 부른 횟수 입력: ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>(); //다형성 이용
		
		System.out.println("출석 부른 번호: ");
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		} //array 초기화
		
		sc.close();
		
		Collections.sort(list); //Collection 클래스의 sort 메소드를 이용
		
		System.out.println(list.get(0)); //list의 첫번째 값 출력
		
	}
}
