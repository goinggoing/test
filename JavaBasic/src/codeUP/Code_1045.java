package codeUP;

import java.util.Scanner;

//정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//단 0 <= a, b <= 2147483647, b는 0이 아니다.
//정수 2개가 공백을 두고 입력된다.

public class Code_1045 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		boolean run = true; //while문을 제어하기  위한 변수
		
		try { //int형의 범위만 허용
			
			while(run) { //범위 내의 값 입력, while문이 true: 무한 반복, false: 종료 
				
				System.out.println("첫 번째 정수 입력: ");
				int num1 = sc.nextInt();
				
				if(num1 >= 0 && num1 <= 2147483647) { //num1이 조건에 참
					System.out.println("두 번째 정수 입력: ");
					int num2 = sc.nextInt();
					
					if(num2 >= 0 && num2 <= 2147483647 && num2 != 0) { //num2가 조건에 참
						int sum = num1 + num2;
						int sub = num1 - num2;
						int mul = num1 * num2;
						int div = num1 / num2;
						int mod = num1 % num2;
						double result = (double) num1 / num2;
						
						System.out.println(sum);
						System.out.println(sub);
						System.out.println(mul);
						System.out.println(div);
						System.out.println(mod);
						System.out.println(String.format("%.2f", result));
						run = false; //while문 종료
						
					} else { //num2가 조건에 거짓
						System.out.println("조건에 맞지 않는 정수입니다.");
					}
					
				} else { //num1이 조건에 거짓
					System.out.println("다시 입력하세요.");
				}
				
			} //end while
			
			
		} catch(Exception e) { //int 형의 범위 밖의 값 입력
			System.out.println("int형 범위 밖의 정수를 입력했습니다.");
		}
		
		sc.close();
	}
}
