package java05_array;

public class Array_05 {
	public static void main(String[] args) {

		//문자열 배열
		//	String 배열
		//	String[]
		
		//	String을 여러 개 저장할 수 있는 배열
		
		String[] strArr; //배열 선언
		strArr = new String[3]; //배열 생성
		
		//배열에 값 대입
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";

		for(int i=0; i<strArr.length; i++) {
			System.out.println( strArr[i] );
			System.out.println( strArr[i].length() );
			System.out.println("----------");
		}
	}
}












