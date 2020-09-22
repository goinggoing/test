package java04_control.forQuiz;

import java.util.Scanner;

public class ForQuiz_04 {
//	- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//	 프로그램을 작성하라.
//		최소공배수 = 공배수 중에서 가장 작은 정수
//		최대공약수 = 공약수 중에서 절대치가 가장 큰 수	public static void main(String[] args) {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print("Input Number 2 : ");
		int n2 = sc.nextInt();

		
		int lcm=0; //최소공배수
		int max = n1>n2 ?n1 : n2;
		for( int i=max; true; i++ ) {
			if( i%n1==0 && i%n2==0 ) {
				lcm = i;
				break;
			}
		}
		
		
		int gcd=0; //최대공약수
		int min = n1<n2 ?n1 :n2;
		for( int i=1; i<=min; i++ ) {
			if( n1%i==0 && n2%i==0 ) {
				gcd = i;
			}
		}
		
		System.out.println("최소공배수 : "+lcm);
		System.out.println("최대공약수 : "+gcd);
	}
}










