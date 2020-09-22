package java12_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {

	public static void display(List<? super String> list) {
		for( Object o : list ) {
			System.out.println( o );
		}
	}
	
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(10,20,30);
//		display(iList);
		
		List<String> sList = Arrays.asList("A","B","C");
		display(sList);

		List<Double> dList = Arrays.asList(1.1, 2.2, 3.3);
//		display(dList);

	}
}













