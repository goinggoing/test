package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_Performance {
	public static void main(String[] args) {
		
		//성능 평가, Performance Evaluation
		//	알고리즘 시작 전 현재시간 체크
		//	알고리즘 완료 후 현재시간 체크
		//	둘의 차이를 구한다
		
		// 성능평가 변수
		long start = System.currentTimeMillis();
		//성능 평가 하려는 알고리즘 추가
		long end = System.currentTimeMillis();
		
		//밀리초 단위로 시간차이 구하기
		System.out.println( (end-start)/(double)1000 );
		
		// -----------------------------------------------
		
		File file = new File("./src/java14_io/filterStream", "Source.txt");
		
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
			start = System.currentTimeMillis(); //fis 테스트 전
			while( (len = fis.read(buf)) != -1 ) {
//				System.out.print( new String(buf, 0, len) );
			}
			end = System.currentTimeMillis(); //fis 테스트 후
			System.out.println("fis 결과 : " + (end-start)/(double)1000 );

			// --------------------------------------------------
			//파일 입력 스트림 생성
			fis = new FileInputStream(file); //File -> FileInputStream
			bis = new BufferedInputStream(fis); //FileInputStream->BufferedInputStream

			//파일 입력
			start = System.currentTimeMillis(); //bis 테스트 전
			while( (len = bis.read(buf)) != -1 ) {
//				System.out.print( new String(buf, 0, len) );
			}
			end = System.currentTimeMillis(); //bis 테스트 후
			System.out.println("bis 결과 : " + (end-start)/(double)1000 );


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














