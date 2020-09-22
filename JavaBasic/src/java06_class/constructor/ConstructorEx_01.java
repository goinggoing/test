package java06_class.constructor;

class Constructor_01 {
	private int num1;
	private int num2 = 200;
	
	//매개변수가 없는 생성자 - 디폴트 생성자
	public Constructor_01() {
		System.out.println("디폴트 생성자");
		
		System.out.println(num2);
		
		num1 = 500;
		num2 = 600;

		System.out.println(num2);
	}
	
	//매개변수가 있는 생성자
	public Constructor_01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//일반 메소드 - 생성자와 헷갈리니까 절대 이렇게 만들지 말 것
	public void Constructor_01() { }
	
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

public class ConstructorEx_01 {
	public static void main(String[] args) {
		
		Constructor_01 c01; //객체 변수 선언
		c01 = new Constructor_01(); //객체 생성 - 생성자 호출
	
		Constructor_01 c02;
		c02 = new Constructor_01(111, 222);
		
		// Scanner sc = new Scanner(System.in);
		
		System.out.println("c01 : " + c01.getNum1() + ", " + c01.getNum2());
		System.out.println("c02 : " + c02.getNum1() + ", " + c02.getNum2());
	}
}








