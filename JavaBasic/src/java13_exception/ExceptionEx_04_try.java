package java13_exception;

public class ExceptionEx_04_try {
	public static void main(String[] args) {
		
		try {
			//try블록
			// 예외가 발생하는 코드
			// 예외 발생이 예측되는 코드
			
		} catch (ArithmeticException e) {
			//ArithmeticException 처리 코드
			System.out.println("적절하지 않은 산술을 연산함");
			
		} catch (NullPointerException e) {
			//NullPointerException 처리 코드
			System.out.println("null을 이용한 참조");

		} catch (Exception e) {
			//예외들의 최상위 클래스 Exception 처리 코드
			
			// 위 catch구문들에 적용되지 않는
			//나머지 모든 예외들에 대한 처리 코드
			System.out.println("Arithmetic, NullPointer를 제외한 나머지");
			
		} finally {
			// 사용하지 않아도 되는 블록
			
			//예외가 발생하지 않아도 실행되는 블록
			//예외가 발생해도 실행되는 블록
			
			//예외와 상관없이 무조건 수행해야하는 코드를 작성함
			
			// 주로 try에서는 Checked Exception이 발생하고
			//finally에서는 자원해제를 해야할 때 사용한다
		}
		
		
		System.out.println("+ + 정상종료! + +");
	}
}













