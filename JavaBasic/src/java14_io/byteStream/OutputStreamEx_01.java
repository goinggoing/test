package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_01 {
	public static void main(String[] args) {
		
		OutputStream os = null; //출력 스트림 객체
		os = System.out; //표준출력 스트림 (모니터)
		
		try {
			os.write(97); // 'a'
			os.write('b'); // 98
			os.flush(); //버퍼비우기, 출력버퍼의 내용 내보내기
			
			os.write('\n');
			
			os.write('1');
			os.write('2');
			os.flush();
			
			// 출력스트림의 flush()를 하지 않으면
			//출력버퍼에만 데이터가 기록되고
			//실제 출력장치(모니터)에는 출력되지 않는다
			
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










