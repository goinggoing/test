package java09_innerClass;

public class OuterEx {
	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		System.out.println( o.num ); //인스턴스변수
		o.print(); //멤버메소드
		
		System.out.println("----------");
		System.out.println( o.mi.num ); //멤버중첩클래스의 멤버필드
		o.mi.print(); //멤버중첩클래스의 멤버메소드
		
		System.out.println("----------");
		
		Outer.MemberInner memIn; //멤버중첩클래스 객체 변수 선언
		memIn = new Outer().new MemberInner(); //멤버중첩클래스 객체 생성
		
		System.out.println("----------");
		
		//정적 멤버 사용하기
		System.out.println( Outer.staticNum );
		Outer.display();
		
		//정적 중첩클래스 사용하기
		System.out.println( Outer.StaticInner.num );
		Outer.StaticInner.out();
		
		System.out.println("----------");
		
		o.out();
		new Outer().out();
		
	}
}
















