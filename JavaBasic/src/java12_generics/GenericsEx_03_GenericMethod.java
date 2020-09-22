package java12_generics;

//일반 클래스
class Class03 {

	// 제네릭 메소드
	public <T> void display(Integer num) {
		T data; // 지역변수에 제네릭 사용

		data = (T) num; // 형변환연산자로도 사용 가능
	}

	public <T> T out(T obj) { // 반환타입, 매개변수에도 제네릭 사용 가능
		T data;
		data = obj;

		return data;
	}

}

//제네릭 클래스
class Class03_2<T> {

	// 제네릭 클래스의 멤버로 정의된 제네릭 메소드는
	// 클래스와 메소드의 타입파라미터 모두 사용 가능
	public <K> void display(K obj, T data) {
		T t;

		K k;
	}

}

public class GenericsEx_03_GenericMethod {
	public static void main(String[] args) {

		Class03 c03 = new Class03();

		c03.display(112233); // 타입파라미터 전달안함, T -> Object

		c03.<Double>display(555); // T->Double

		// -------------------------------

		c03.out("Alice"); // 제네릭타입 자동으로 결정됨, T->String
		c03.<Integer>out(64545); // 타입파라미터를 직접 명시, T->Integer

		// 매개변수타입으로 자동결정하는 동작과
		// <>타입파라미터로 직접명시하는 동작을 동시에 수행하면
		// 직접 명시한 타입파라미터를 따른다
//		c03.<Double>out(true); T->Double

		// ----------------------------------------------

//		Double result = c03.out(123); // T-> Integer

	}
}









