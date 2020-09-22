package codeUP;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//빨강(red), 초록(green), 파랑(blue) 빛을 섞어
//여러 가지 빛의 색을 만들어 내려고 한다.
//
//빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
//(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
//
//주어진 rgb 빛들을 다르게 섞어 만들 수 있는 모든 경우의 조합(r g b)과
//총 가짓 수를 계산해보자.

public class Code_1084 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); //Scanner 객체 생성
		System.out.println("rgb 색 정보 입력: ");
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<g; j++) {
				for(int k=0; k<b; k++) {
					
					String st = i + " " + j + " " + k;
					try {
						bf.write(st + "\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		try {
			bf.write(Integer.toString(r*g*b));
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
