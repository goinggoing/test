package java07_inheritance;

class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2 {
	private int num;
	
	@Override
	public void display() {
		num = 100;
		
		System.out.println("오버라이딩 메소드");
	}
}

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
//		c.num = 123;
		c.display();
		
		System.out.println("----------------");
		
		Parent2 p = new Parent2();
		p.num = 333;
		p.display();
		
		System.out.println("----------------");
		
		Parent2 pc = new Child2(); // Parent2 <- Child2
		
		//안됨, ClassCastException 발생
//		Child2 cp = (Child2)new Parent2(); // Child2 <- Parent2
		
		pc.display();
		
		pc.num = 222;
	
	}
}















