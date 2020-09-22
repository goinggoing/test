package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//실수 1개를 입력받아 그대로 출력해보자.
//(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
//
//참고
//float 데이터형을 사용하면 +- 3.4*10-38 ~ +- 3.4*1038 범위의 실수를 저장할 수 있다.
//(float 로 선언하고 %f로 입력 받아 출력하면 된다.)
//
//이 범위를 넘어가는(더 작거나 더 큰) 실수를 저장하기 위해서는
//보다 큰 범위를 저장할 수 있는 다른 데이터형을 사용해야 정상적으로 저장시킬 수 있다.
//double은 더 정확하게 저장할 수 있지만, float보다 2배의 저장 공간이 필요하다.

public class Code_1029 {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in); 
		System.out.println("실수를 입력하세요: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		double num = sc.nextDouble(); 
//		sc.close();
		
		System.out.println(br.readLine()); 
		br.close();
	}
}
