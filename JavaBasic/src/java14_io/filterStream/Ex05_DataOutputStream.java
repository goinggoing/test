package java14_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체 생성
		File file = new File("./src/java14_io/filterStream", "DataTest.txt");

		//데이터 출력 스트림 선언
		DataOutputStream dos = null;
		
		try {
			//파일출력스트림 -> 버퍼출력스트림 -> 데이터출력스트림
			dos = new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(file) ) );
			
			//데이터 출력
			dos.write(123); // 아스키코드
			
			dos.writeBoolean(true); //1B
			dos.writeChar('T'); //2B
			dos.writeDouble(5.345); //8B
			dos.writeInt(123); //4B
			
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close(); //스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}













