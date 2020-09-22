package java06_class.overloading;

public class Overloading_02 {

	// 전달인자의 문자수(길이)를 구해서 반환
	public int getLength(int num) {
		// int -> String 형변환 ( String.valueOf() 사용 )
		String str = String.valueOf(num);

		// 문자열의 길이 반환
		int len = str.length();
		
		return len;
	}
	
	public int getLength(boolean b) {
		String str = String.valueOf(b); // boolean -> String
		
		return str.length(); // 문자열의 길이
	}
	
	public int getLength(double d) {
		return String.valueOf(d).length();
	}
	
}












