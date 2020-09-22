package java13_exception;

public class ExceptionEx_06_throw {
	public static void main(String[] args) {
		
//		String str = null;
//		if( str == null ) {
//			throw new NullPointerException();
//		}
		
		Exception e = new NullPointerException();
		
		try {
			throw e; //Exception 타입으로 인식함
			
		} catch (NullPointerException e1) {
			System.out.println("널포인터 참조 예외");
			
		} catch (Exception e2) {
			System.out.println("모든 예외");
			
		} finally {
			System.out.println("무조건 실행");
			
		}
		
		System.out.println(" + + + 프로그램 정상 종료 + + +");
		
	}
}












