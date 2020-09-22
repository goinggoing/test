package java13_exception;

import java.io.IOException;

class ThrowsEx {
	public char readChar() throws IOException {
		return (char)System.in.read();
	}
}

public class ExceptionEx_10_throws {
	public static void main(String[] args) {
		
		ThrowsEx te = new ThrowsEx();
		
		char ch = '\0'; // null문자
		
		try {
			System.out.print("Input : ");
			ch = te.readChar();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Output : " + ch);
		
	}
}












