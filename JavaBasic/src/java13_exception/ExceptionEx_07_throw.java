package java13_exception;

class ThrowEx {
	
	//매개변수 str을 cnt횟수만큼 출력
	public void print(String str, int cnt) {
		
		if( str == null ) {
			throw new NullPointerException(); //예외 발생
		}
		
		for(int i=0; i<cnt; i++) { // i, 0~cnt-1, cnt횟수
			System.out.println(str);
		}
		
	}
	
}

public class ExceptionEx_07_throw {
	public static void main(String[] args) {

		ThrowEx te = new ThrowEx();
		
		String str = null;

		try {
			te.print(str, 3); //예외발생
			
		} catch (NullPointerException e) {
			System.out.println("[WARN] 문자열이 null로 입력됨");
			
		}
		
	}
}














