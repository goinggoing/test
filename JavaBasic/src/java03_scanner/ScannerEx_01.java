package java03_scanner;

//Scanner의 패키지
//	java.util
import java.util.Scanner;

// 이 클래스의 풀네임 : java03_scanner.ScannerEx_01
public class ScannerEx_01 {
	public static void main(String[] args) {
		
		int num; //변수 선언
		num = 123; //값 대입
		
		Scanner input; //입력 객체 변수 선언
		input = new Scanner(System.in); //객체 생성
		
		System.out.print("숫자 입력 하세요 : ");
		
		//키보드로 입력한 정수값을 i 변수에 저장하기
		int i = input.nextInt();
		
		//입력한 값을 출력하기
		System.out.println("입력한 값 : " + i);
		
	}
}











