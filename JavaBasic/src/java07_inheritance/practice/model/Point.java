package java07_inheritance.practice.model;

public class Point {
	protected int x;
	protected int y;
	
	public Point() {
		this(0, 0); //기본값
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public void draw() {
		System.out.println("("+x+", "+y+")");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
