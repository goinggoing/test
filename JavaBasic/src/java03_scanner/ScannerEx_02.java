package java03_scanner;

// ctrl + shift + o : import 최적화 (필요한 클래스 자동 import)
import java.util.Scanner;

// ctrl + i : 들여쓰기 정렬

public class ScannerEx_02 {
	public static void main(String[] args) {

		//문자열 입력받기

		// 1. 입력객체 변수 선언
		Scanner in;

		// 2. 입력객체 생성(new)
		in = new Scanner(System.in);
		
		// 3. 문자열 입력받기
		System.out.print("문자열 입력 : ");
		String str = in.nextLine();
		
		// 4. 입력받은 문자열 출력해보기
		System.out.println("입력한 내용 : " + str);
		

		
//		double d = in.nextDouble();
//		boolean b = in.nextBoolean();
//		int i = in.nextInt();
		
//		char ch = in.nextChar(); //char 전용 입력 메소드는 없음
		
	}
}










