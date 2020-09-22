package java07_inheritance.product;

public class Computer extends Product {
	public Computer(String m, int p) {
		super(m, p);
	}

	@Override
	public void out() {
		System.out.println("Computer");
	}
	
}
















