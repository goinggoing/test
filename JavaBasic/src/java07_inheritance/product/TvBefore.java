package java07_inheritance.product;

public class TvBefore
	extends Product {

	public TvBefore(String model, int price) {
		super(model, price);
	}
	
	@Override
	public void out() {
		System.out.println("TV");
	}

}














