package java14_io.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	public static void main(String[] args) {
		
		//입출력 대상 파일
		File src = new File("./src/java14_io/charStream/Source.txt");
		File dest = new File("./src/java14_io/charStream/Dest.txt");
		
		//입출력 스트림
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		String str = null; //입력 문자열
		try {
			//입출력 스트림 개설
			reader = new BufferedReader(new FileReader(src));
			writer = new PrintWriter(
					new FileWriter(dest), true);//autoFlush
			
			while( (str = reader.readLine()) != null ) {
				writer.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
