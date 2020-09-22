package java13_exception.quiz;

import java13_exception.quiz.exception.NumberRangeException;

public class NumberProcess {
	
	public NumberProcess() { }
	
	public boolean checkDouble(int n1, int n2) throws NumberRangeException{
		
		//예외 발생
		if( n1<1 || n1>100 || n2<1 || n2>100 ) {
			throw new NumberRangeException();
		}
		
		if( n1%n2 == 0 ) {
			return true;
		}
		return false;
	}
	
}











