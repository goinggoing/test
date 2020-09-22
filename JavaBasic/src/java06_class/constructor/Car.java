package java06_class.constructor;

public class Car {
	private String model; //모델명
	private String color; //색상
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void display() {
		System.out.println("모델명 : " + this.model);
		System.out.println("색상 : " + this.color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}










