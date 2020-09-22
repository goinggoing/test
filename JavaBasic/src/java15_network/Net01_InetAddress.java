package java15_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net01_InetAddress {
	public static void main(String[] args) {
		
		InetAddress ip = null; // IP주소 표현 객체
		
		try {
			//호스트네임(도메인네임)을 이용하여 IP정보 얻어오기
			ip = InetAddress.getByName("www.iei.or.kr");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		// 호스트네임 : 노드들을 구분하기 위해 지정한 이름
		// 도메인네임 : 호스트네임의 일종으로 IP와 매핑된 이름
		
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("Address : " + ip.getHostAddress());
		System.out.println("toString() : " + ip);
		
		System.out.println("--------------------");

		try {
			// 자기 자신의 호스트 정보 얻기
			ip = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("HostName : " + ip.getHostName());
		System.out.println("Address : " + ip.getHostAddress());
		System.out.println("toString() : " + ip);

	}
}















