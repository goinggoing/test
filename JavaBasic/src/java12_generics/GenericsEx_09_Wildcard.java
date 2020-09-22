package java12_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_09_Wildcard {

	public static void display(List<?> list) {
		for( Object o : list ) {
			System.out.println( o );
		}
	}
	
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(10,20,30);
		display(iList);
		
		List<String> sList = Arrays.asList("A","B","C");
		display(sList);
		
		// --------------------------------------------
		
		Object o = null;
		Integer i = null;
		
		o = i; // Object는 Integer의 부모클래스
		
		// --------------------------------------------
	
		List<Object> ol = null;
		List<Integer> il = null;
		
//		ol = il; //에러
		
	}
}













