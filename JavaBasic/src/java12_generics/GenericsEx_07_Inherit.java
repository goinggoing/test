package java12_generics;

class Parent<T> {
	T data;
}

class Child01 extends Parent { //T -> Object
}

class Child02 extends Parent<String> { //T -> String
}

class Child03<K> extends Parent<K> { // T -> K
	// 상속받은 타입 파라미터를 결정하지 않고 미룬다
}

class Child04<M, N> extends Parent<M> {
	N data2;
	
	// M data1 : 상속받은 제네릭 M을 이용한 멤버필드, 타입 미결정
	// N data2 : 자식클래스의 고유한 제네릭 타입, 타입 미결정
}

public class GenericsEx_07_Inherit {
	public static void main(String[] args) {
		
		Child03<String> c =  new Child03<>();
		
	}
}












