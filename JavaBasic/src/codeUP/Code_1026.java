package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//입력되는 시:분:초 에서 분만 출력해보자.
//
//참고
//int h, m, s;
//scanf("%d:%d:%d", &h, &m, &s);
//
//를 실행하면 콜론을 사이에 둔 형식으로 입력되어, h, m, s에 각각 정수값만 저장된다.

public class Code_1026 {
	public static void main(String[] args) throws IOException  {
		
		System.out.println("시:분:초를 입력해주세요 ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int a = Integer.parseInt(br.readLine()); //-> sc.nextInt();
		String[] date = br.readLine().split(":");
//		System.out.println(date[1]);
		
		for(int i=0; i<date.length; i++) {
			if(i==1) {
				System.out.println(date[i]);
			}
		}
	}
}
