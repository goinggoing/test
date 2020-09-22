package java12_generics;

class Data<K> {
	K data;
}

class Class05<T> {
	Data d1; // K->Object
	Data<String> d2; // K->String
	
	Data<T> d3; // K->T
}

public class GenericsEx_05_ClassMember {
	public static void main(String[] args) {
		
		// T->Integer
		Class05<Integer> c05 = new Class05<>();
		c05.d1.data = 100;

		c05.d1 = new Data<>(); // Data<K> -> Data<Object>
		c05.d2 = new Data<>(); // Data<K> -> Data<String>
		c05.d3 = new Data<>(); // Data<K> -> Data<T> -> Data<Integer>
		
	}
}












