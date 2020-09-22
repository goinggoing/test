package java14_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {
	public static void main(String[] args) {
		
		//출력 대상 파일 객체
		File file = new File(
				"./src/java14_io/filterStream",
				"BufferedOutputTest.txt");
		
		//파일 출력 스트림 객체
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			//파일 출력 스트림 생성
//			fos = new FileOutputStream(file);
//			bos = new BufferedOutputStream(fos);
			
			bos = new BufferedOutputStream( new FileOutputStream(file) );
			
			bos.write( "Orange".getBytes() ); //파일 출력
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(bos!=null)	bos.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}











