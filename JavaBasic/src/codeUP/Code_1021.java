package codeUP;

import java.util.Scanner;

//단어 1개 입력받아 그대로 출력하기

public class Code_1021 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단어를 입력하세요: ");
//		String word = sc.next();
//		System.out.println(word);
		
		// 방법2 : 입력받아서 메모리에 저장안하고 바로 출력
		System.out.println(sc.next());
		
		sc.close();

	}

}
