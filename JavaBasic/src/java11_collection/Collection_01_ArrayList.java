package java11_collection;

import java.util.ArrayList;
import java.util.List;

public class Collection_01_ArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//자료구조에서 자주 사용되는 동작(로직, 알고리즘)
		//		CRUD 작업
		//		Create	-추가/삽입
		//		Read	-조회/탐색
		//		Update	-수정/변경
		//		Delete	-삭제
		
		System.out.println("---삽입-------");
		list.add("Apple"); //삽입
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list); //전체 출력
		
		//for를 이용한 모든 요소 출력
		for( int i=0; i<list.size(); i++ ) {
			System.out.println( list.get(i) ); // arr[i]
		}
		
		System.out.println("\n---삭제-------");
//		list.remove("Banana"); // equals() 에 해당하는 요소 삭제
		list.remove(1); // 1번째 인덱스 삭제
		
		System.out.println(list);
		
		System.out.println("\n---삽입-------");
		list.add("Tomato");
		System.out.println(list);
		
		System.out.println("\n---contains()-------");
		System.out.println( list.contains("Tomato") );
		
		System.out.println("\n---isEmpty()-------");
		System.out.println( list.isEmpty() );
		
		
		List l = null; //리스트 생성하지 않음
//		if( l.isEmpty() ) { }
		if( l == null ) { }
		
		List ll = new ArrayList();
		if( ll.isEmpty() ) { }
		if( ll == null ) { }
		
		System.out.println(l); // null
		System.out.println(ll); // []
		
		System.out.println("\n---모든 요소 출력하기-------");
		list.add(123);
		list.add(5343.47456);
		list.add(true);
		
		System.out.println(list); //객체를 이용한 출력
		
		System.out.println("-----");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //for문 이용한 출력
		}
		
		System.out.println("-----");
		for(Object o : list) { // foreach문 이용한 출력
			System.out.println(o);
		}
		
		System.out.println("\n---clear()--------");
		System.out.println(list);
		list.clear(); //전체 요소 삭제
		System.out.println(list);
	}
}














