package java14_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_02 {
	public static void main(String[] args) {
		
		// 입력 대상 파일
		File file = new File("./src/java14_io/file", "Hello");
		System.out.println("[TEST] exists : " + file.exists());
		
		StringBuffer sb = new StringBuffer(); //입력 데이터 저장소
		
		int len = -1; //입력 길이 (while문 반복할 때마다 입력한 길이)
		byte[] buf = new byte[1024]; //입력 데이터 임시 저장소
		int tot = 0; //입력한 총 길이
		

		FileInputStream fis = null; //파일입력객체 선언
		try {
			fis = new FileInputStream(file); //파일입력스트림 생성
			
			//파일 입력 -> 데이터 저장소
			//FileInputStream -> StringBuffer
			while( (len = fis.read(buf)) != -1 ) {
				sb.append( new String(buf, 0, len) );
				
				tot += len; //총 길이 계산
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
		
		System.out.println("[입력받은 길이] " + tot);
		System.out.println(sb);
		System.out.println("+ + + 프로그램 종료 + + +");
		
	}
}














