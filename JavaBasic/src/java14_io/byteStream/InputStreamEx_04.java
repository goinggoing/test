package java14_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_04 {
	public static void main(String[] args) {
		
		InputStream is = System.in; //표준입력 스트림
		
		int len = 0; //입력받은 데이터의 길이
		byte[] buf = new byte[1024]; //입력 데이터의 임시 저장소(Buffer)
		
		//입력받은 데이터 저장소
		StringBuffer sb = new StringBuffer();
		
		System.out.println("<< 입력 대기중 >>");
		try {
			while( (len = is.read(buf, 0, buf.length)) != -1 ) { // EOF를 만날 때까지
				
				//입력받은 길이만큼 문자열로 변환
				String str = new String(buf, 0, len);
				
				sb.append(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(is!=null)	is.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
		
		System.out.println("\n<<입력 결과>>");
		System.out.println(sb);
		
	}
}















