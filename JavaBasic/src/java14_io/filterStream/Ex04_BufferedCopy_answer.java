package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_BufferedCopy_answer {
	public static void main(String[] args) {
		
		// BufferedInputStream 과 BufferedOutputStream을 이용한
		// Source.txt -> Dest.txt 복사
		
		
		// 파일 객체
		File src = new File("./src/java14_io/filterStream/Source.txt");
		File dest = new File("./src/java14_io/filterStream/Dest.txt");
		
		// 입출력 스트림 객체 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		// 파일 입출력 보조 변수
		byte[] buf = new byte[1024]; // 버퍼
		int len = -1; // 입출력 길이(1회)
		int tot = 0; // 총 입출력 길이
		
		try {
			// 파일 입출력 스트림 개설
			bis = new BufferedInputStream( new FileInputStream(src) );
			bos = new BufferedOutputStream( new FileOutputStream(dest) );
			
			// 파일 입력
			while( (len=bis.read(buf)) != -1 ) {
				
				//파일 출력
				bos.write(buf, 0, len);
				bos.flush();
				
				// 파일카피 총 길이
				tot += len;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 파일스트림 개설 실패");
			System.out.println("\t>> 파일 없음");
			System.out.println("\t>> 알 수 없는 경로");
			
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 입출력 실패");
			
		} finally {
			try {
				// 스트림 닫기
				if(bis!=null)	bis.close();
				if(bos!=null)	bos.close();
				
			} catch (IOException e) {
				System.out.println("[ERROR] 파일닫기 실패");
				
			}
		}
		
		System.out.println(tot+" 바이트 복사 완료");
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
		
	}
}
