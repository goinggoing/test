package java13_exception;

public class ExceptionEx_05_MultiCatch {
	public static void main(String[] args) {

		// 들여쓰기 정렬 : 마우스로 코드를 드래그하고 ctrl + i

		// 문서 양식 정형화 : ctrl + shift + f

		try {

		} catch (NullPointerException
				| ArithmeticException
				| ArrayIndexOutOfBoundsException e) {

			System.out.println("예외가 발생했음");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}







