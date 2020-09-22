package java11_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_07_Map {
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		//삽입
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("map : " + map);
	
		System.out.println("\n---get(3)-------");
		System.out.println(map.get(3)); // 3=Cherry
		
		System.out.println("\n---put()-------");
		map.put("D", "Durian");
		System.out.println("map : " + map);
		System.out.println("get(\"D\") :" + map.get("D"));
		
		System.out.println("----------");
		map.put(2, "Orange");	//기존에 존재하는 Key
		map.put(4, "Apple");	//기존에 존재하는 Value
		
		System.out.println("map : " + map);
		
		System.out.println("\n---contains-------");
		System.out.println("Key 5 : " + map.containsKey(5));
		System.out.println(
				"Value \"Apple\" : "
				+ map.containsValue("Apple"));
		
		// key 5가 존재하지 않을 경우에 데이터 삽입
		if( !map.containsKey(5) ) {
			map.put(5, "Grape");
		}
		
		// 555 라는 key가 존재할 때만 코드를 수행하도록 유도
		if( map.containsKey(555) ) {
			String str = (String)map.get(555);
			System.out.println( str.length() );
		}
		
		System.out.println("\n---size()-------");
		System.out.println(map.size());
		
		System.out.println("\n---isEmpty()-------");
		System.out.println(map.isEmpty());
		
		System.out.println("\n---remove()-------");
		map.remove(3); //key를 찾아 Entry를 제거
		System.out.println(map);
		
		// key를 찾아서 value가 일치하면 Entry 제거
		map.remove(2, "Apple");
		System.out.println(map);
		
		System.out.println("\n---null 값 처리-------");
		map.put(null, "Bob"); //key가 null인 상황은 좋지 않음
		map.put(10, null);
		
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		
		System.out.println("\n---map -> set-------");
		Set keySet = map.keySet(); //Key들을 Set으로
		Set entrySet = map.entrySet(); //Key-Value 쌍 Entry를 Set으로

		System.out.println("Key Set : " + keySet);
		System.out.println("Entry Set : " + entrySet);
		
		System.out.println("-----");
		
		Set keys = map.keySet(); //키 셋
		Iterator iter = keys.iterator(); //Key Set의 반복자
		
		while(iter.hasNext()) { // Key Set Iterate(반복)
			Object key = iter.next(); // Key 꺼내기 
			
			System.out.println( map.get(key) ); // Key에 해당하는 Value
		}
	}
}














