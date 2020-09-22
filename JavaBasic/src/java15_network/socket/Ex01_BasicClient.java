package java15_network.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex01_BasicClient {
	public static void main(String[] args) {
		
		Socket sock = null; //클라이언트 소켓
		
		PrintWriter out = null; //출력스트림
		
		try {
			System.out.println(" + + + 클라이언트 실행 + + +");
			sock = new Socket("192.168.0.18", 10001); //서버 접속
			
			// ----- 데이터 통신 -----
			// sock에서 입출력스트림을 얻어 통신
			
			//출력 스트림 개설
			//Socket -> OutputStream -> PrintWriter
			out = new PrintWriter(sock.getOutputStream(), true); //autoFlush
			
			out.println("Hello"); //데이터 전송
			// -------------------------
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close(); //스트림 닫기
			
			try {
				if(sock!=null)	 sock.close(); // 통신 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}












