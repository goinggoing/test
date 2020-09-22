package java01_variables;

public class VariablesEx_05 {
	public static void main(String[] args) {
		
		System.out.println( 777 ); // 리터럴상수 777
		
		final int MAX; //변수의 상수화
		
		MAX = 100; //한번만 대입 가능, 이후 100으로 고정됨
//		MAX = 200; //다시 대입하기 불가능
//		MAX = 300; //다시 대입하기 불가능
		
		//관례적으로 상수화된 변수의 이름은 모두 대문자로 선언
		System.out.println("MAX : " + MAX);
		
		
		// ex)
		final int STUDENT_NUM = 10;
		
		//STUDENT_NUM = 1111111;
		
		double avg = 987 / STUDENT_NUM;
		
	}
}






