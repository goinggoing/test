package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//정수 1개를 입력받아 그대로 출력해보자.
//단, 입력되는 정수의 범위는
//-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.
//
//참고
//-2147483648 ~ +2147483647 범위의 정수를 저장하고 처리하기 위해서는
//int 데이터형을 사용해 변수를 선언하면 된다.
//(int 로 선언하고 %d로 입력받아 저장하고, 출력하면 된다.)
//
//int 형으로 저장할 수 있는 범위를 넘어가는 정수 값을 저장하기 위해서는
//보다 큰 범위를 저장할 수 있는 다른 데이터형을 사용해야 한다.

public class Code_1030 {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("정수를 입력하세요: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		long num = sc.nextLong(); //정수 입력
//		sc.close();
		
		System.out.println(br.readLine()); //입력한 정수 출력
	}
}
