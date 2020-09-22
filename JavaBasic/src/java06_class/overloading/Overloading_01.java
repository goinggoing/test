package java06_class.overloading;

public class Overloading_01 {

	private int x;
	private int y;
	
	// 멤버 x, y를 출력
	public void display() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	// int형 2개를 전달인자로 받아 멤버 x, y를 초기화 및 출력
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
//		System.out.println("(" + x + ", " + y + ")");
		display();
	}
	
	public void display(double d) { }
	public void display(String s) { }
	
	public int display(int i) {
		return i;
	}
	
	// 리턴타입만 바껴서는 오버로딩이 성립되지 않는다
//	public void display(int i) { }
	
}












