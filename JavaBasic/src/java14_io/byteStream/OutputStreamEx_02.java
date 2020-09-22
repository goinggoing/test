package java14_io.byteStream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx_02 {
	public static void main(String[] args) {
		
		OutputStream os = System.out; //표준출력 스트림

		byte[] buf = new byte[1024]; //버퍼
		
		buf[0] = 'A'; //65
		buf[1] = 'B'; //66
		buf[2] = 67; //'C'
		buf[3] = 68; //'D'
		buf[4] = '\n'; //10
		buf[5] = 'H';
		buf[6] = 'I';
		buf[7] = '\n';
		
		try {
			os.write(buf);
			os.flush(); //버퍼 비우기
			
			// -------------------------------------------
			
			String str = "Hello";
			byte[] tmp = str.getBytes(); // String -> byte[]
			
			os.write(tmp);
			os.flush();
			
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















