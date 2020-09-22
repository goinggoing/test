package java11_collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection_05_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
//		Set set = new LinkedHashSet();
//		Set set = new TreeSet();
		
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(20);
		
		System.out.println(set);
		
		
		System.out.println("---------------");
		
		Iterator iter = set.iterator();
		
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
		System.out.println("--------------");
		
		Object[] arr = set.toArray();
		System.out.println( Arrays.toString(arr) );
		
		Arrays.sort(arr); //오름차순 정렬
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}















