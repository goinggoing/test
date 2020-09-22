package java07_inheritance;

class Parent {
	String name;
	int num;
	
	public void display() {
		System.out.println("부모 클래스의 메소드");
	}
}

class Child extends Parent {
	int score;
	
	public void print() {
		System.out.println("자식 클래스의 메소드");
	}
	
	@Override // 어노테이션, Annotation ( 오버라이딩 어노테이션 )
	public void display() {
		System.out.println("오버라이딩 메소드");
		System.out.println("상속받은 메소드를 재정의");
	}
}

public class InheritEx_01 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.num = 123;
		
		p.display();
		
		System.out.println("--------------------");
		Child c = new Child();
		
		c.name = "Bob";
		c.num = 4444;
		c.score = 55555;
		
		c.display();
		c.print();
		
	}
}













