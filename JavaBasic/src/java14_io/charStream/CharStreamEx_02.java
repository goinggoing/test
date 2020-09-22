package java14_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//표준입력스트림 System.in -> Reader
		Reader reader = new InputStreamReader(System.in); 
		
		//표준출력스트림 System.out -> Writer
		Writer writer = new OutputStreamWriter(System.out);

		char[] cbuf = new char[1024]; //임시 저장소
		int len = -1; //입력한 데이터 길이
		
		try {
			//EOF가 입력될 때까지 키보드 입력 받기
			while( (len = reader.read(cbuf)) != -1 ) {
				writer.write(cbuf, 0, len); //입력받은 문자 출력하기
				
				writer.flush(); //버퍼비우기 - 엔터 누를때마다
			}

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













