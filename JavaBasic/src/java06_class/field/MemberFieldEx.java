package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
		mf01.setNum(100);
		mf02.setNum(200);
//		mf03.setNum(300); //참조대상이 없음, NullPointerException
		
		System.out.println( mf01.getNum() ); 
		System.out.println( mf02.getNum() ); 
		
		System.out.println("---------------");
		
		System.out.println( mf01.getName() ); 
		System.out.println( mf02.getName() );
		
		System.out.println("-----------------");
		


//		MemberField_02 mf04 = new MemberField_02();
//		MemberField_02 mf05 = new MemberField_02();
//		
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//		
//		mf04.city = "Busan";
//		
//		System.out.println(mf04.city);
//		System.out.println(mf05.city);
//		
//		System.out.println("--------------");
//		
//		MemberField_02.city = "Incheon";
//		System.out.println( MemberField_02.city );
		
		//---------------------------------------
		
//		System.out.println( MemberField_02.city );
		System.out.println( MemberField_02.getCity() );
		
	}
}













