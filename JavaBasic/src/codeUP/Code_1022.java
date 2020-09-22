package codeUP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//공백 문자가 포함되어 있는 문장을 입력받고 그대로 출력하는 연습을 해보자

public class Code_1022 {
	public static void main(String[] args) {
		
		//입력 클래스인 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			System.out.println("문장을 입력하세요: ");
			String str = br.readLine();
			
			bw.write(str + "\n"); //입력 받은 str의 값을 받음
			bw.flush();	//버퍼에 있는 값들을 전부 출력
			bw.close();	// 출력 종료 후 bufferedWriter 닫기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //한 문장을 입력
		
		//방법2 : 코드 간결하게
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println(br.readLine());
		
	}
}
