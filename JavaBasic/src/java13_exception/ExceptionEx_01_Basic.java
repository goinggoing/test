package java13_exception;

public class ExceptionEx_01_Basic {
	public static void main(String[] args) {
		
		int[] arr = new int[5]; //인덱스 : 0 ~ 4
		
		int i = 0;
		while(true) { //무한루프
			
			if( i<0 || i >= arr.length ) { //예외처리
				System.out.println("[SYSTEM] 인덱스는 " + arr.length
						+ "보다 작아야 합니다.");
				
				break;
			}
			
			arr[i] = i+1; //배열에 값 대입
			System.out.println(arr[i]); //배열의 요소 출력
			
			System.out.println("---" + i + "번쨰 완료 ---");
			
			i++;			
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
		
	}
}
