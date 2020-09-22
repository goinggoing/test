package java08_abstract.interfaceEx;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();
		
		System.out.println("----------------------");
		
		// extends한 클래스는 부모클래스가 된다
		Parent p; //부모클래스
		p = new Child(); //부모클래스<-자식클래스
		p.out(); //자식클래스의 메소드 호출(인스턴스 확인)
		
		System.out.println("----------------------");
		
		// implements한 인터페이스도 부모 타입이 된다
		Inter_01 i01 = new Child();
		Inter_02 i02 = new Child();
		
		i01.out();
		i02.out();
		
	}
}

// ** 자바는 다중상속을 금지하고 있다
//class Parent1 {
//	public void out() {
//		
//	}
//}
//class Parent2 {
//	public void out() {
//		
//	}
//}
//
//class Children extends Parent1, Parent2 {
//	// 어떤 out() 메소드를 상속받아야할지, 호출해야할지 모호해짐
//	// 자바는 extends를 하나의 클래스만 하도록 만들었음
//}














