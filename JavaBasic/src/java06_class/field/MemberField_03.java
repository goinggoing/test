package java06_class.field;

public class MemberField_03 {
	
	private int num = 777; //인스턴스 변수
	private static int num2 = 555; //클래스 변수, 정적 변수
	
	//일반 메소드
	public void method02(int var) { //var, 매개변수, 지역변수
		int num = 101; //지역변수
		int num2 = 202; //지역변수
		
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println( this.num );
		System.out.println( this.num2 );
		System.out.println( MemberField_03.num2 );
	}
	

	public static void method() { //정적메소드
//		System.out.println(num); //인스턴스 변수, 불가
		System.out.println(num2); //정적 변수, 가능
	}
	
}















