package codeUP;

import java.util.Scanner;

//어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자

public class Code_1018 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
//		방법1
//		StringTokenizer st = new StringTokenizer(sc.next(),":");
//		System.out.printf("%s:%s", st.nextToken(), st.nextToken());

//		방법2
		System.out.println("시간을 입력하세요(ex - 3:16): ");
		String time = sc.nextLine();
		String[] arr = time.split("\\:");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		System.out.printf("%01d:%02d", A, B);

//		방법3		
//		String time = sc.nextLine();
//		String[] arr = time.split("\\:");
//		System.out.printf("%s:%s", arr[0], arr[1]);
		
	}
	
}
