package java15_network.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_BasicServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; //서버 리슨 소켓
		Socket sock = null; //서버 통신 소켓
		
		BufferedReader in = null; //입력 스트림
		
		try {
			// ----- 서버 리슨 소켓 활성화 -----
			servSock = new ServerSocket(10001); //리슨 소켓 생성
			System.out.println(" + + + 서버 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("----- 접속 대기중 -----");
			System.out.println("  Listen Port : "
					+ servSock.getLocalPort()); //서버 리슨 포트
			System.out.println("-----------------------");
			
			sock = servSock.accept(); // Listen
			// -----------------------------------
			
			// ----- BLOCKED -----
			
			// ----- 접속 정보 확인 -----
			System.out.println("클라이언트 접속!!");
			InetAddress ip = sock.getInetAddress();//클라이언트 ip정보얻기
			System.out.println("  >>클라이언트 IP : " + ip.getHostAddress());
			System.out.println("  >>클라이언트 Port : " + sock.getPort());
			System.out.println("-----------------------");
			// -------------------------
			
			
			// ----- 데이터 통신 -----
			// sock 객체에서 입출력스트림을 얻어 통신
			
			// Client Socket -> InputStream -> Reader -> BufferedReader
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream()));
			
			//클라이언트가 전송한 문자열을 읽어서 모니터로 출력
			String msg = in.readLine();
			System.out.println("\n\t>> 전송데이터 : " + msg);
			// -------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null)	in.close(); //스트림 닫기
				
				if(sock!=null)	sock.close(); //통신 소켓 닫기
				if(servSock!=null)	servSock.close(); //리슨 소켓 닫기
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}














