package java11_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_02_ArrayList {
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		List<String> list2 = new ArrayList<String>();
		
		list2.add("Apple");
//		list2.add(123);//list2는 제네릭타입 <String>을 통해 타입이 제한됨
		
		// ------------------------------------------
		List<Integer> list3 = null;
//		List<int> list4; //기본데이터타입을 제네릭타입으로 설정할수없음
		
//		list3.add(111);
//		list3.add((int)554.343); //double안됨 -> 강제 형변환 int
		
		// ------------------------------------------
		//제네릭은
		//	객체 변수 선언 시 적용
		//	객체 생성코드에서 적용
		//두번 설정하게 되어 있지만 객체 생성 코드에서는 <>로 생략가능
		//	단, JDK7 (java1.7) 이상부터 가능하다
		
		List<Double> list5 = new ArrayList<>();
		
		// ------------------------------------------
		int[] arr = {1,2,3,4,5};
		
		List intList = Arrays.asList( 1,2,3,4,5 );
		System.out.println(intList);
		
		List strList = Arrays.asList( "A", "B", "C" );
		System.out.println(strList);
		
	}
}














