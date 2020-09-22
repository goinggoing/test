package java15_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	public static void main(String[] args) {
		
		String urlStr = "https://www.oracle.com:443/downloads/";
		
		URL url = null; //URL정보 객체
		URLConnection conn = null; //URL 접속 객체
		
		//입력스트림 : URLConnection에서 얻음
		BufferedReader in = null;
		
		//출력대상 파일
		File file = new File("./src/java15_network/download.html");
		
		//출력스트림 : File
		PrintWriter out = null;
		
		try {
			url = new URL(urlStr); //연결할 URL 객체 생성
			
			conn = url.openConnection(); //URL 연결 수립
			
			// URL 연결 객체로부터 입력 스트림 얻기
			in = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream())); 
			// conn -> InputStream
			// InputStream -> Reader
			// Reader -> BufferedReader
			
			//파일 출력 스트림 개설
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)), true); //autoFlush
			// Program -> PrintWriter
			// PrintWriter -> BufferedWriter
			// BufferedWriter -> FileWriter
			// FileWriter -> File
			
			String str = null; //입력데이터
			
			// URL데이터 입력 -> File 출력
			while( (str = in.readLine()) != null ) {
				out.println(str);
			}
			
		} catch (MalformedURLException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 잘못된 형식의 URL 지정");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] URL 접속 실패");
		} finally {
			try {
				if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if(out!=null)	out.close();
			
		}
		
		
	}
}











