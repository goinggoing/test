package java12_generics;

public class GenericsEx_06_Extends {
	public static void main(String[] args) {
		
		print(123);
		print(34563.356345);
//		print("Alice"); // Number의 자식클래스가 아니어서 T 로 사용 불가
		
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	}
	
}













