package java13_exception;

public class ExceptionEx_12_CustomException {
	public static void main(String[] args) {
		
		//짝수 판별 객체
		CheckEven ce = new CheckEven();
		
		try {
			ce.check(13);
		} catch (EvenException e) {
			e.printStackTrace();
		}
		// 예외 상황
		//		"홀수를 입력했습니다!" - 예외메시지로 출력
		
		try {
			ce.check(12);
		} catch (EvenException e) {
			e.printStackTrace();
		}
		// 정상 상황
		//		"짝수입니다" - 문구 출력
	}
}







