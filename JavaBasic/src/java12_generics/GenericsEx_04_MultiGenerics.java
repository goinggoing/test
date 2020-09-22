package java12_generics;

//멀티 제네릭 클래스
class Class04<T1, T2> {
	private T1 data1;
	private T2 data2;
	
	
	//멀티 제네릭 메소드
	public <K1, K2> K2 change(K1 data) {
		K2 result = (K2) data;
		
		return result;
	}
	
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
}

public class GenericsEx_04_MultiGenerics {
	public static void main(String[] args) {
		
		Class04<Integer, String> c04 = new Class04<>();
		// T1->Integer, T2->String
		
		c04.setData1(1464574);
		c04.setData2("Hello");
		
		// ----------------------------------------------
		
		Class04<Double, Integer> c05 = new Class04<>();
		
		// ----------------------------------------------

		Double res = c04.change(100); // K1->Integer, K2->Double
		
		Double res2 = c04.<Integer,Double>change(54574);
		System.out.println(res2);
	}
}












