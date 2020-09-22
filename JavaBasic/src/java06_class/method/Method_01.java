package java06_class.method;

public class Method_01 {

// 0. 메소드의 기본형태 작성
	public void method() {
	}
// 1. 메소드 이름 -> 만들고자 하는 기능을 대표하는 이름으로 적절히
// 2. 매개변수 작성 -> 기능을 수행하는 데 필요한 입력 값을 저장하는 변수 
// 3. 실행코드 작성 -> 메소드가 수행할 기능을 작성, 구현
// 4. return코드 작성 -> 수행 결과로 사용할 반환할 값
// 5. return타입 작성 -> return코드의 값의 데이터타입을 명시
	

	
	// 2개의 정수를 덧셈해주는 기능
	public int add(int num1, int num2) {
		int result = num1 + num2; 
		
		return result;
	}
	
	// 0. 메소드의 기본형태 작성
	// 1. 메소드 이름 -> 덧셈 기능, add
	// 2. 매개변수 작성 -> 2개의 정수, int num1, int num2
	// 3. 실행코드 작성 -> 2개의 정수 덧셈, int result = num1+num2;
	// 4. return코드 작성 -> return result;
	// 5. return타입 작성 -> int
	
}













