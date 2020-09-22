package java08_abstract.interfaceEx;

interface TestInterface {
	
	public static final int NUM = 999; //상수
	
	//public static final 이 없어도 적용된 상태의 상수
	int NUMBER = 100; //상수
	
	static final int NUM2 = 444;
	
	// ----------------------------------
	
	public abstract void display();
	
	//abstract 키워드가 없어도 추상메소드로 작성됨
	public void out();
}

class Test implements TestInterface {
	@Override
	public void display() {
	}
	@Override
	public void out() {
	}
}

abstract class TestClass {
	public static final int MAX = 999; //상수

	public abstract void method();
}

public class InterfaceEx {
	public static void main(String[] args) {
		System.out.println( TestClass.MAX );
	}
}










