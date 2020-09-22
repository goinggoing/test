package java13_exception;

public class CheckEven {

	public void check(int num) throws EvenException {
		
		if( num%2 == 0 ) { //짝수 - 정상
			System.out.println("짝수입니다");
			
		} else { //홀수 - 예외
			throw new EvenException();
			
		}
		
	}
	
}








