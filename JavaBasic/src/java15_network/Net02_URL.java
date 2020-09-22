package java15_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {
	public static void main(String[] args) {
		
//		String urlStr = "https://www.oracle.com/downloads/";
		String urlStr = "https://www.oracle.com:443/downloads/";
		
		URL url = null;
		
		try {
			url = new URL(urlStr);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트 : " + url.getPort());
		System.out.println("파일경로 : " + url.getFile());
		System.out.println("전체 : " + url.toExternalForm());
		
		// URL 파싱(parsing)
		//	parse : 구문 분석, 문법적인 해석(분석)
		
	}
}












