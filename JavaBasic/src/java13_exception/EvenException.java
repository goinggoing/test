package java13_exception;

public class EvenException extends Exception {
	@Override
	public String getMessage() {
		return "홀수를 입력했습니다!";
	}
}
