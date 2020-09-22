package java11_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_08_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties(); // Properties 객체
		
		try {
			prop.load(
				new FileReader("./src/java11_collection/user.properties") );
//			./src/java11_collection/user.properties
//
//			.	현재 프로그램이 실행된 폴더
//				workspace 안에 있는 프로젝트폴더를 지칭한다
			
			System.out.println(prop);
			System.out.println("-----------");
			
			// 속성값 가져오기
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);
			
			String pass = prop.getProperty("password");
			System.out.println("PASS : " + pass);
			
			//인증, Authentication, auth
			if( user.equals("abc") && pass.equals("123") ) {
				System.out.println("로그인성공");
			}
			
			user = "abc";
			pass = "123";
			
			prop.setProperty("username", user);
			prop.setProperty("password", pass);
			
			prop.store(
				new FileWriter("./src/java11_collection/user.properties")
				, "user information");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("-----------------------");
		
		Properties sysProp = System.getProperties();
		
		System.out.println("---자바 버전---");
		System.out.println( sysProp.get("java.version") );

		System.out.println("---OS 이름---");
		System.out.println( sysProp.get("os.name") );
		
		System.out.println("---사용자 계정---");
		System.out.println( sysProp.get("user.name") );
		
		System.out.println("--------------------");
		System.out.println(sysProp);

	}
}












