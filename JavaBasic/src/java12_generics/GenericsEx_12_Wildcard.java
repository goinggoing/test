package java12_generics;

import java.util.List;

public class GenericsEx_12_Wildcard {

	public static void main(String[] args) {
		List<Integer> iList = null;
		List<String> sList = null;
		List<Double> dList = null;

		// -------------------------------------------------
		
		List<? extends Number> nl = null;
		nl = iList;
//		nl = sList; //에러
		nl = dList;
		
//		<? extends Number> 는 부모타입
//		<Integer>, <Double> 은 자식타입
//		extends 키워드가 사용되면 부모타입이 자식타입을 품을 수 있다
		
		// -------------------------------------------------

		List<Object> oList = null;
		List<? super String> superList = null;
		
		superList = oList;
		superList = sList;
//		superList = iList; //에러
//		superList = dList; //에러
		
//		<Object> 는 부모타입
//		<? super String>은 자식타입
		
//			자식타입이 부모타입을 품는다 (정상적인 상속구조의 반대)
		
	}
}













