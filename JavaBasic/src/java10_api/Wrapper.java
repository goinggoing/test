package java10_api;

public class Wrapper {
	public static void main(String[] args) {
		
		int i1 = 10;
		Integer iVal1 = new Integer( i1 ); //박싱, Boxing
		
		Integer iVal2 = new Integer("123");
		Integer iVal3 = new Integer(4564);
		
		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);
		
		System.out.println("-----------");
		
		double d1 = 123.456;
		Double dVal1 = new Double(d1); //박싱, Boxing
		Double dVal2 = new Double("46.789");
		
		System.out.println(d1);
		System.out.println(dVal1);
		System.out.println(dVal2);
	
		System.out.println("---------");
		
		int num1 = Integer.parseInt("1234");
		System.out.println(num1);
		
//		int num2 = Integer.parseInt("1234ABC");
		int num2 = Integer.parseInt("-1234");
		System.out.println(num2);
		
		double num3 = Double.parseDouble("3.14");
		System.out.println(num3);
		
		System.out.println("-----------");
		System.out.println(Integer.MAX_VALUE); //최대값
		System.out.println(Integer.MIN_VALUE); //최소값
		
		System.out.println(Integer.BYTES); //용량 바이트
		System.out.println(Integer.SIZE); //용량 비트
	
		
		int i2 = iVal2.intValue(); // Integer -> int, 언박싱, Unboxing
		double d2 = dVal2.doubleValue();
		
		System.out.println("------------");

		// 오토 박싱
		Integer iVal4 = 20;
		Double dVal3 = 33333.22222;
		
		// 오토 언박싱
		int i4 = iVal4;
		double d3 = dVal3;
		
		System.out.println("--------------");
		
		out( 1.12345 );
		out( "HIHI" );

		out( 123 );
		// int -> Integer : 오토 박싱
		// Integer -> Object : 상속(자동형변환)
		
	}
	
	public static void out(Object obj) {
		System.out.println("obj : " + obj);
		
		// System.out.println은 객체를 매개변수로 받으면 toString()을
		//호출해서 반환값을 출력
		
		// obj.toString() 을 호출
		// 동적바인딩 -> Integer클래스의 toString() 동작
		// Integer의 toString()의 반환값 -> "123"
		
	}
}















