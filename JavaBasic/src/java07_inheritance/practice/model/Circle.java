package java07_inheritance.practice.model;

public class Circle extends Point {
	private int radius;
	
	public Circle() {
		this(0,0,0); //기본값
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		setRadius(radius);
	}

	@Override
	public void draw() {
		System.out.print("중심점 : ");
		super.draw();
		
		System.out.print("원 면적 : ");
		System.out.printf("%.1f\n", (Math.PI * radius * radius) );
		
		System.out.print("원 둘레 : ");
		System.out.printf("%.1f\n", (2 * Math.PI * radius) );
//		https://keep-cool.tistory.com/15참조
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
