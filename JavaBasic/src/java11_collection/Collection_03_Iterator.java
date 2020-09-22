package java11_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {
		
		//반복자, Iterator
		//	 컬렉션의 모든 요소들을 순차적으로
		//	읽어오는 방법을 표준화한 것
		
		List list = Arrays.asList( "A", "B", "C", "D", "E" );
			
		Iterator iter; //반복자
		
		iter = list.iterator(); //리스트의 iterator 생성
		
		//Iterator의 주요메소드
		//	boolean hasNext() : 다음 요소 존재여부, true/false
		//	E next() : 다음 요소 반환
		
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
	}
}












