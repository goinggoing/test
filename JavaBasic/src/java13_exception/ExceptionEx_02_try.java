package java13_exception;

public class ExceptionEx_02_try {
	public static void main(String[] args) {
		
		int[] arr = new int[5]; //인덱스 : 0 ~ 4
		
		int i=0;
		
		//예외처리
		try {	
			while(true) { //무한루프
				arr[i] = i+1; //배열에 값 대입
				System.out.println(arr[i]); //배열의 요소 출력
				
				System.out.println("---" + i + "번째 완료");
				
				i++;
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[WARN] 배열의 인덱스를 벗어남");
//			e.printStackTrace(); //콘솔에 빨간 예외구문 출력
				
		}
		
		System.out.println("+ + + 프로그램 정상 종료 + + +");
	}
}











