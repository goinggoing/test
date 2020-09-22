package java07_inheritance.product;

public abstract class Product { //추상클래스
	protected String model; //모델명
	protected int price; //제품 가격
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	//추상메소드
	public abstract void out();
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}




