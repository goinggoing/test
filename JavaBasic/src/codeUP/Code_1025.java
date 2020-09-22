package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.

public class Code_1025 {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
//		
//		System.out.println("정수를 입력하세요: ");
//		int num = sc.nextInt(); //다섯자리 정수 입력 받음
//		sc.close();
//		
//		//5자리 수 중 1번 째(만의 자리)
//		int first = (num / 10000) * 10000;
//		
//		//5자리 수 중 2번 째(천의 자리)
//		int second = (num - first) / 1000 * 1000;
//		
//		//5자리 수 중 3번 쨰(백의 자리)
//		int third = (num - first - second) / 100 * 100;
//		
//		//5자리 수 중 4번 째(십의 자리)
//		int fourth = (num - first - second - third) / 10 * 10;
//		
//		//5자리 수 중 5번 째(일의 자리)
//		int fifth = (num - first - second - third - fourth);
//		
//		System.out.println("[" + first + "]");
//		System.out.println("[" + second + "]");
//		System.out.println("[" + third+ "]");
//		System.out.println("[" + fourth + "]");
//		System.out.println("[" + fifth + "]");
		
		//방법 2 : toCharArray()이용해서 String 문자열을 잘라서 아스키코드로 변환 -> 출력할때는 48(아스키코드값:0)을 빼줘서 int형으로 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i] - 48);
		}
		
	}
}
