package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedInputStream {
	public static void main(String[] args) {
		
		File file = new File("./src/java14_io/filterStream", "Source.txt");
//		System.out.println("[TEST] " + file.exists());
		
		//파일 입력 스트림 객체
		FileInputStream fis = null; //1차 스트림
		BufferedInputStream bis = null; //2차 스트림
		
		//파일 입력 관련 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = -1; //입력 데이터 길이
		
		try {
			//파일 입력 스트림 생성
			fis = new FileInputStream(file); //File -> FileInputStream
			bis = new BufferedInputStream(fis); //FileInputStream->BufferedInputStream
			
			//파일 입력
			while( (len = bis.read(buf)) != -1 ) {
				System.out.print( new String(buf, 0, len) );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// close()는 생성시킨 역순으로 수행할 것!
				if(bis!=null)	bis.close();
				if(fis!=null)	fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			
		}
		
	}
}













