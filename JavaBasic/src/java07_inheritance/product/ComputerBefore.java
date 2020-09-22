package java07_inheritance.product;

public class ComputerBefore 
	extends Product {

	public ComputerBefore(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}

}














