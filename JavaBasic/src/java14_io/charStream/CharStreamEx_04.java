package java14_io.charStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CharStreamEx_04 {
	public static void main(String[] args) {
		
		//입출력 스트림 생성
		BufferedReader in = new BufferedReader(
				new InputStreamReader( System.in ) );
		PrintWriter out = new PrintWriter( System.out, true );//autoFlush
		
		String str = null; //입력받은 문자열

		try {
			//입력받은 내용 출력하기
			while( (str = in.readLine()) != null ) {
				out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close();
				if(out!=null)	out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}











