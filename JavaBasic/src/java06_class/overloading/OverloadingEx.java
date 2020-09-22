package java06_class.overloading;

public class OverloadingEx {
	public static void main(String[] args) {
		
		Overloading_01 ol01 = new Overloading_01();
		
		System.out.println("---display()---");
		ol01.display();
		
		System.out.println("---display(int, int)---");
		ol01.display(11,22);
		
		System.out.println("-----------------------------");

		Overloading_02 ol02 = new Overloading_02();
		
		System.out.println( ol02.getLength(112233) );
		System.out.println( ol02.getLength(78654) );
		
		System.out.println("----------");
		System.out.println("true의 문자수 : " + ol02.getLength(true));
		System.out.println("false의 문자수 : " + ol02.getLength(false));
		
		System.out.println("11.2233의 문자수 : " + ol02.getLength(11.2233));
		
	}
}











