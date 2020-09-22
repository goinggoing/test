package java13_exception.quiz;

import java.util.Scanner;

import java13_exception.quiz.exception.CharCheckException;
import java13_exception.quiz.exception.NumberRangeException;

public class ExceptionQuizEx {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
//		quiz1();
		
		quiz2();
		
	}
	
	public static void quiz1() {
		CharacterProcess cp = new CharacterProcess();
		
		System.out.print("Input String : ");
		String s = sc.nextLine();
		
		try {
			System.out.println( cp.countAlpha(s) );
			
		} catch (CharCheckException e) {
			e.printStackTrace();
			
		}
	}

	public static void quiz2() {
		NumberProcess np = new NumberProcess();
		
		System.out.print("Input Number1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		int n2 = sc.nextInt();
		
		try {
			if( np.checkDouble(n1, n2) ) {
				System.out.println(n1+"은/는 " + n2 +"의 배수이다");
			} else {
				System.out.println(n1+"은/는 " + n2 +"의 배수가 아니다");
			}
			
		} catch (NumberRangeException e) {
			e.printStackTrace();
			
		}
	}
}












