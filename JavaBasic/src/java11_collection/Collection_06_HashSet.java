package java11_collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_06_HashSet {
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);

		System.out.println(set);
		
		System.out.println("---------------");
		
		System.out.println("크기 : " + set.size());
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println("222가 존재? " + set.contains(222));
		System.out.println("30가 존재? " + set.contains(30));
		System.out.println("30을 제거 : " + set.remove(30));
		System.out.println("50을 제거 : " + set.remove(50));
		
		System.out.println(set);
		
		set.clear(); //요소 전부 제거
		System.out.println("비었는가? " + set.isEmpty());
		System.out.println(set);
		
	}
}















