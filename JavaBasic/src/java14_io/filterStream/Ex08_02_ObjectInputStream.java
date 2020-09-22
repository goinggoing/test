package java14_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Ex08_02_ObjectInputStream {
	public static void main(String[] args) {
		
		//파일 객체 선언 
		File file = new File(
				"./src/java14_io/filterStream",
				"ObjectTest2.ser");
		
		//스트림 객체 선언
		ObjectInputStream ois = null;
		
		try {
			//스트림 객체 생성
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file) ));
			
			//객체 입력 받기
			List list = (List) ois.readObject();
			
			for( int i=0; i<list.size(); i++ ) {
				System.out.println( list.get(i) );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}













