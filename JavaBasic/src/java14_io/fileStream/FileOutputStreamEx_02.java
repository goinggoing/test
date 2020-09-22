package java14_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("./src/java14_io/fileStream", "Result");
//		System.out.println("[TEST] exists : " + file.exists());
		
		//파일 출력 스트림 객체 선언
		FileOutputStream fos = null;
		
		//출력할 데이터
		byte[] b = "반갑습니다!".getBytes();
		
		try {
			// 쓰기모드, 추가모드 상관없이 모두 파일이 없다면 생성
			
//			fos = new FileOutputStream(file); //쓰기 작성모드
			// 쓰기모드 - 파일의 처음부터 기록

			fos = new FileOutputStream(file, true); //추가 작성모드
			// 추가모드 - 파일의 끝에 추가 기록
			//		true - append(추가모드)
			//		false - write(쓰기모드)
			
			fos.write(b, 0, b.length);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("+ + + 프로그램 종료 + + +");
		
	}
}












