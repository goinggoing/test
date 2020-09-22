package java07_inheritance.practice.model;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		this(0, 0, 0, 0);
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		setWidth(width);
		setHeight(height);
	}

	@Override
	public void draw() {
		System.out.print("좌표 : ");
		super.draw();

		System.out.print("면적 : ");
		System.out.printf("%.1f\n", (width*(double)height) );

		System.out.print("둘레 : ");
		System.out.printf("%.1f\n", (2*(width+(double)height)) );
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
