package java06_class;

public class Main_03 {
	public static void main(String[] args) {
		
		Class_03 cl = new Class_03();
		
		cl.setNum( 123 ); //setter 호출
		
		int n = cl.getNum(); //getter 호출
		
		System.out.println(n);
		
		System.out.println( cl.getNum() );
		
	}
}








