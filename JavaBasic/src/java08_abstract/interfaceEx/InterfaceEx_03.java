package java08_abstract.interfaceEx;

//클래스 -> 클래스 : extends
//인터페이스 -> 클래스 : implements
//인터페이스 -> 인터페이스 : extends

//클래스 -> 인터페이스 : 안됨


interface InterA {
	public abstract void getA();
}
interface InterB {
	public abstract void getB();
}
interface InterC extends InterA, InterB {
	public abstract void getC();
}

class Child03 implements InterC {
	@Override
	public void getA() {
	}
	@Override
	public void getB() {
	}
	@Override
	public void getC() {
	}
}














public class InterfaceEx_03 {
}













