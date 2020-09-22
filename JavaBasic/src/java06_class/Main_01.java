package java06_class;

// 실행 클래스
public class Main_01 {
	public static void main(String[] args) {
		
		Class_01 c01; //Class_01 타입의 객체 변수 c01 선언
		c01 = new Class_01(); // Class_01 타입의 객체 생성
		
		c01.num = 100; //멤버필드 num에 값 대입
		c01.str = "Apple"; //멤버필드 str에 값 대입
		
		// c01객체의 멤버필드 num, str 출력
		System.out.println( c01.num );
		System.out.println( c01.str );
		
		// c01객체의 멤버메소드 display 호출(call)
		c01.display(); // 메소드명을 적고 ( )괄호를 뒤에 붙인다
		
		// --------------------------
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 100;
		c03.num = 200;
		c04.num = 300;
		c05.num = 400;

//		c03 = new Class_01();
//		System.out.println( c03.num );
	}
}














