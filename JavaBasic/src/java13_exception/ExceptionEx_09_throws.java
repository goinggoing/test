package java13_exception;

import java.io.IOException;

public class ExceptionEx_09_throws {
	public static void main(String[] args) {
		
		try {
			System.out.print("Input : ");
			
			//키보드 입력 1바이트 받기
			char input = (char) System.in.read();
			
			//입력된 데이터 확인
			System.out.println("입력값 : " + input); //char형으로 확인
			System.out.println("ASCII : " + (int)input ); //int형으로 확인
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}











