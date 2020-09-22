package java06_class.field;

public class MemberField_02 {
	
	//클래스 변수, 정적 변수, static변수
	private static String city = "Seoul";
	
	//정적 메소드, static 메소드
	public static String getCity() {
		return city;
	}
	

	// 정적메소드에서 인스턴스 변수 사용 불가
//	private int num; //인스턴스 변수
//	public static void test() { //정적 메소드
//		System.out.println( num );
//	}
	
	private static int num2; //정적 변수
	public void test2() { //일반 메소드
		System.out.println(num2);
	}
	
	
	

}















