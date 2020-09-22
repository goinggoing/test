package codeUP;

import java.io.IOException;
import java.util.Scanner;

//문자형으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
//변수에 저장되어 있는 문자를 그대로 출력해보자

public class Code_1011 {
	public static void main(String[] args) {
		
//		long a = System.currentTimeMillis();
//		long c = System.nanoTime();
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char ch = br.readLine().charAt(0);
		
		Scanner sc = new Scanner(System.in);
//		
		System.out.println("문자를 입력하세요: ");
//		
		char ch = sc.next().charAt(0); 
//		
		System.out.println("입력한 값: " + ch);
//		
		sc.close();
		
//		br.close();
//		long b = System.currentTimeMillis();
//		System.out.println(b-a);
	}
	
}


