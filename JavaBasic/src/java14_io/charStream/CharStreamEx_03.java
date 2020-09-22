package java14_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CharStreamEx_03 {
	public static void main(String[] args) {
	
		// System.in -> InputStreamReader -> BufferedReader
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ) );
		
		// System.out -> OutputStreamWriter -> BufferedWriter
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter( System.out ) );
		
		String str = null; //입력받은 문자열
		
		try {
			//읽을 내용이 없을 때까지(EOF) 한 줄 씩 입력받아 String반환
			while( (str = br.readLine()) != null ) {
				bw.write(str); //입력받은 문자열 출력
				bw.newLine(); //개행
				
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//스트림 닫기
				if(bw!=null)	bw.close();
				if(br!=null)	br.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}













