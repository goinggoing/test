package codeUP;

import java.util.Scanner;

//어떤 규칙에 따라 수를 순서대로 나열한 것을 수열(series)이라고 한다.
//
//예를 들어
//1 4 7 10 13 16 19 22 25 ... 은
//1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
//이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여
//
//등차(차이가 같다의 한문 말) 수열이라고 한다.
//수열을 알게 된 영일이는 갑자기 궁금해졌다.
//
//"그럼.... 123번째 나오는 수는 뭘까?"
//
//영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.
//
//시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
//n번째 수를 출력하는 프로그램을 만들어보자.

public class Code_1089 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("a, d, n 입력: ");
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		int count = 1; //n과 비교될 변수
		sc.close();
		
		while(count != n) {
			a += d;
			count++;
		}
		System.out.println(a);

	}
}
