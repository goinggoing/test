package java12_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		// 타입파라미터 E가 Object로 결정됨
		list.add("APPLE");
		list.add(123);
		
		System.out.println("----------------");
		
		List<String> list2 = new ArrayList<>();
		// 타입파라미터 E -> String
//		list2.add(123); //에러
		list2.add("HIHIHI");
		
		//기본데이터타입 사용 불가 -> Wrapper클래스 사용
//		List<int> list3 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		list3.add(123);
		
		
		// 타입 안정성 : 의도한 데이터타입으로만 사용되는 것
//		list2.add(true); //String만 사용가능
//		list3.add("안녕"); //Integer만 사용가능
		
		
		// 타입 안정성이 없는 경우
		list.add("A");
		list.add(1345);
		list.add(true);
		
		
		System.out.println(list.get(0)); // "APPLE" -> String
		
		String str1 = (String) list.get(0); //타입 안정성이 없음
		
		String str2 = list2.get(0); //타입 안정성이 있음 
		
	}
}













