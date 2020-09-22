package java14_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {
		
		//스트림 기본적으로 바이트 단위로 통신
		//	바이트스트림 -> 문자스트림 변환 필요
		
		//	InputStreamReader
		//		InputStream -> Reader
		
		//	OutputStreamWriter
		//		OutputStream -> Writer
		
		
		//표준입력스트림 System.in -> Reader
		Reader reader = new InputStreamReader(System.in); 
		
		//표준출력스트림 System.out -> Writer
		Writer writer = new OutputStreamWriter(System.out);

		int in = -1; //입력한 문자
		
		try {
			//EOF가 입력될 때까지 키보드 입력 받기
			while( (in = reader.read()) != -1 ) {
				writer.write(in); //입력받은 문자 출력하기
				
//				writer.flush(); //버퍼비우기 - 엔터 누를때마다
			}
			
			writer.flush(); //버퍼비우기 - EOF(ctrl+z) 했을 때

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				//스트림 닫기
				if(writer!=null)	writer.close();
				if(reader!=null)	reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}













