package java14_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_03 {
	public static void main(String[] args) {
		
		InputStream is = System.in; //표준입력 스트림
		
		int len = 0; //입력받은 데이터의 길이
		byte[] buf = new byte[1024]; //입력 데이터의 임시 저장소(Buffer)
		
		//입력받은 데이터 저장소
		StringBuffer sb = new StringBuffer();
		
		System.out.println("<< 입력 대기중 >>");
		try {
			while( (len = is.read(buf)) != -1 ) { // EOF를 만날 때까지
				
				//입력받은 길이만큼 문자열로 변환
				String str = new String(buf, 0, len);
				// new String(buf) 로 변환하면
				//byte[1024]의 1024개 요소를 전부 변환한다
				//	-> 입력받지 않은 데이터까지 전부 변환
				//	-> 입력받은 길이만큼만 변환하도록
				//	  offset은 0으로 length는 len으로 지정
				
				System.out.println("str : " + str);
				System.out.println("len : " + len + "B");
				
				//입력받은 문자열 저장해두기
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















