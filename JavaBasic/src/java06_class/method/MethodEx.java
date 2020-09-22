package java06_class.method;

import java.util.Arrays;

public class MethodEx { // Excutor, 실행 클래스
	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01();

		int res = m01.add(100, 200);
		
		System.out.println("결과 : " + res);
		
		System.out.println("---------------------------");
		
		System.out.println("덧셈 결과 : " + m01.add(56, 78) );
		
		System.out.println("---------------------------");
		
		Method_02 m02 = new Method_02();
		
		m02.method01();
		
		m02.method02(100); //100, 전달인자, 전달인수, argument
		
		m02.printNum2(123, 456);
		
		System.out.println( m02.returnNum() );
		
		System.out.println( m02.add(400, 600) );
		
		System.out.println("--------------------------------");
		
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5]; //int형 배열
		int num; //int형 변수
		
		arr[2] = 100;
		num = 200;
		
		System.out.println( Arrays.toString(arr) );
		System.out.println( num );
		
		m03.arrayTest01(arr); // Call By Reference, 참조값 전달
		m03.arrayTest02(num); // Call By Value, 기본형 데이터 전달

		System.out.println("-----------------------");
		System.out.println( Arrays.toString(arr) );
		System.out.println( num );

		int n = m03.arrayTest03();
		n = 20;
		
		int[] a = m03.arrayTest04();
		System.out.println(Arrays.toString(a));
		a[0] = 99;
		System.out.println(Arrays.toString(a));
	}
}














