package codeUP;

import java.util.Scanner;

//실수(float) 1개를 입력받아 저장한후 
//저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여
//소수점 이하 둘 쨰 자리까지 출력하시오


public class Code_1015 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수를 입력하세요: ");
		float fl = sc.nextFloat();
		
//		System.out.print(Math.round(fl*100)/100.0);
		System.out.printf("%.2f", fl);
	}
	
}


