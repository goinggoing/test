package java14_io.byteStream;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_02 {
	public static void main(String[] args) {
		
		InputStream is = System.in; //표준입력 스트림
	
		//입력받은 데이터 저장소
		StringBuffer sb = new StringBuffer();
		
		//입력받은 데이터
		int in = -1;

		System.out.println("<< 입력 대기중 >>");
		try {
			
			//입력받을 데이터가 남아있는 동안 반복
			while( (in = is.read()) != -1 ) { //EOF가 입력될 때까지
				//입력된 아스키코드를 문자로 변형하여 sb에 저장
				sb.append( (char)in );
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[ERROR] 스트림 읽기 실패");
			
		} finally {
			// 자원 해제 -> 프로그램이 사용한 외부 장치를 해제한다
			// 입력스트림 해제
			
			try {
				if(is!=null)	is.close();//스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[ERROR] 스트림 닫기 실패");
			} 
		}
		
		// 키보드에서는 EOF를 전송하기 위해 ctrl + z를 사용한다
		
		//	ctrl + z : 가상키로 '^Z'를 표현한다 -> EOF
		
		System.out.println("\n<<입력 결과>>");
		System.out.println( sb );
		
	}
}













