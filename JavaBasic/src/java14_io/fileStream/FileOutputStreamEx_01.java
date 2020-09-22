package java14_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {
	public static void main(String[] args) {
		
		//출력 대상 파일
		File file = new File("D:/", "FileOutTest.txt");
		
		FileOutputStream fos = null; //파일 출력 객체
		
		try {
			fos = new FileOutputStream(file); //파일 출력 스트림 생성
			
			String str = "Hello FileStream"; 
			fos.write(str.getBytes(), 0, str.length());
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












