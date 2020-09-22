package java11_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "Alice", "Swimming");
		Person p2 = new Person(2, "Andy", "Soccer");
		Person p3 = new Person(3, "Kim", "Golf");
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(new Person(8, "Ace", "Ace"));
		list.add(new Person(4, "Ccc", "Ccc"));

		//정렬 전 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		Comparator<Person> comp = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) { //sort의 기준
				
//				취미를 기준으로 내림차순 정렬한다
//				if( o1.getHobby().compareTo( o2.getHobby() ) < 0 ) {
//					return 1;
//				} else if( o1.getHobby().compareTo( o2.getHobby() ) > 0 ) {
//					return -1;
//				} else {
//					return 0;
//				}
				
//				취미를 기준으로 오름차순 정렬한다
				if( o1.getHobby().compareTo( o2.getHobby() ) < 0 ) {
					return -1;
				} else if( o1.getHobby().compareTo( o2.getHobby() ) > 0 ) {
					return 1;
				} else {
					return 0;
				}
				
			}
		};
		
		Collections.sort(list, comp);
		
		System.out.println("------------------------------");
		//정렬 후 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}













