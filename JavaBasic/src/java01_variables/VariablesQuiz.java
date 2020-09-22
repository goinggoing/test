package java01_variables;

public class VariablesQuiz {
	// 변수에 알맞은 타입을 골라 선언하고
	// 대입한 후 출력해보자.

	// 개인정보 변수
	// 이름, 나이, 성별, 키

	//	출력 예시
	//	이름 : Alice
	//	나이 : 99
	//	성별 : 남
	//	키 : 222.66

	//	ex)
	//	System.out.println("이름 : " + name);
	
	public static void main(String[] args) {
		
		//절적한 데이터타입 생각해보기
		//이름 - String 문자열
		//나이 - int 정수
		//성별 - char 문자 (한글, 영어 무관)
		//키 - double 실수
		
		//변수 생성 - [자료형] [변수명];
		String name; //이름
		int age; //나이
		char gender; //성별
		double height; //키
		
		//적절한 값 대입하기
		name = "Alice"; //문자열은 "" 이용하여 표현
		age = 23;
		gender = '여'; //단일 문자는 '' 이용하여 표현
		height = 170.5;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
	}
}















