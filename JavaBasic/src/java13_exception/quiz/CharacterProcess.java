package java13_exception.quiz;

import java13_exception.quiz.exception.CharCheckException;

public class CharacterProcess {
	
	public CharacterProcess() { }
	
	public int countAlpha(String s) throws CharCheckException {
		int cnt = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			//예외 발생
			if( Character.isSpaceChar( s.charAt(i) ) ) {
				throw new CharCheckException();
			}

//			if( Character.isAlphabetic( s.charAt(i) ) ) {
			if( s.charAt(i)>='a' && s.charAt(i)<='z'
					|| s.charAt(i)>='A' && s.charAt(i)<='Z' ) {
				cnt++;
			}
		}
		
		return cnt;
	}
}









