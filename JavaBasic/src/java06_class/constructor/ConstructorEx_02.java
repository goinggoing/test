package java06_class.constructor;

class Constructor_02 {
	private int num1;
	private int num2;
	
	public Constructor_02() {
//		this.num1 = 100;
//		this.num2 = 200;
		
		this(100, 200);

		System.out.println("디폴트 생성자");
	}
	
	public Constructor_02(int num1) {
//		this.num1 = num1;
//		this.num2 = 600;
		
		this(num1, 600); //this 생성자 호출 (다른 생성자를 호출)
		
		System.out.println("매개변수가 1개인 생성자");
	}
	
	public Constructor_02(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		// 생성자에서 멤버필드를 초기화 할 때
		//setter를 사용할 수 있다 
//		setNum1(num1);
//		setNum2(num2);
		
		System.out.println("매개변수가 2개인 생성자");
	}

	//멤버 필드 출력
	public void out() {
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}

public class ConstructorEx_02 {
	public static void main(String[] args) {
		Constructor_02 cons = new Constructor_02();
		cons.out();

		Constructor_02 cons2 = new Constructor_02(999, 888);
		cons2.out();

		Constructor_02 cons3 = new Constructor_02(333);
		cons3.out();

	}
}










