package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {
	public static void main(String[] args) {
		
		//입력 대상 파일
		File file = new File("D:/", "FileTest.txt");
//		System.out.println("[TEST] exists : " + file.exists());
	
		
		FileInputStream fis = null; //파일 입력스트림 객체
		
		StringBuffer sb = new StringBuffer(); //입력한 데이터 저장소
		
		int in = -1; //입력받은 데이터
		int len = 0; //입력 받은 길이
		
		try {
			fis = new FileInputStream(file); //파일 입력 스트림 생성
			
			// FileInputStream -> StringBuffer
			while( (in = fis.read()) != -1 ) {
				sb.append( (char)in );
				len++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("[입력받은 길이] " + len + "B");
		System.out.println(sb);
		System.out.println(" + + + 프로그램 종료 + + +");
	}
}













