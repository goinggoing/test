package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_03 {
	public static void main(String[] args) {
		
		OutputStream os = System.out; //표준출력 스트림

		byte[] buf = new byte[1024];
		
		int len = 0; //의미있는 데이터의 길이
		
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		buf[len++] = '\n';
		buf[len++] = '\n';
		buf[len++] = '\n';
		buf[len++] = '\n';
		buf[len++] = 'B';
		buf[len++] = 'a';
		buf[len++] = 'n';
		buf[len++] = 'a';
		buf[len++] = 'n';
		buf[len++] = 'a';
		buf[len++] = '\n';
		
		try {
			os.write(buf, 0, len); // 0번째 인덱스부터 len 만큼 출력
			os.flush(); //버퍼 비우기
						
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)	os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}











