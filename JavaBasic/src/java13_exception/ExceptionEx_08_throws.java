package java13_exception;

import java.io.IOException;

class ThrowsTest {
	
	public void method() throws IOException {
		throw new IOException();
	}
	
}

public class ExceptionEx_08_throws {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		try {
			tt.method();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
}










