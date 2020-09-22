package codeUP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
//
//년월일(yyyy.mm.dd)를 입력받아,
//
//일월년(dd-mm-yyyy)로 출력해보자.
//
//(단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.) 
//
//
//참고
//출력하는 자리수를 지정하기 위해 %4d와 같은 형식을 사용할 수 있는데,
//빈칸을 0으로 출력하기 위해서는 %04d와 같은 형식을 사용하면 된다.

public class Code_1027 {
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("년월일을 입력하세요: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split("\\."); 
		
		//방법1
//		System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);
		
		//방법2
//		System.out.printf("%s-%s-%s", arr[2], arr[1], arr[0]);

		int[] intArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%02d-%02d-%04d", intArr[2], intArr[1], intArr[0]);

	}
}
