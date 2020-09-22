package java04_control.condition;

public class IfEx_02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if( num == 10 ) {
			System.out.println("HI");
		}
		System.out.println("Hello");
		
		System.out.println("-----------------");
		
		// 중괄호는 코드를 묶어주는 역할을 한다
		// 프로그램 수행 순서에 영향을 미치지는 않는다
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
	
		System.out.println("----------------------");
		
		//제어문은 제어문 다음에 오는 한 개의 요소(코드)에만 영향을 미친다
		if( false )
			System.out.println("if문");
		
		if( false ) {
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("if문 밖");

		// 제어문은 { }없이 코드를 제어하기도하고 { }있는 코드 그룹을
		//제어할 수도 있는데,,,
		//	코드가 한 줄이어도 무조건! { } 를 합시다
		
		System.out.println("-------------");
		
		if( false ); { //제어문 뒤에 ; 붙이는 거 조심하세요!
			System.out.println("Hi");
			System.out.println("Hello");
			
			System.out.println("Hola");
		}
		
	}
}













