package java10_api;

public class StringBufferEx {
	public static void main(String[] args) {
		
		System.out.println("---StringBuffer() 생성-------");
		StringBuffer sb = new StringBuffer();
		info(sb);
		
		System.out.println("\n---StringBuffer(\"Hello\")-------");
		StringBuffer sb2 = new StringBuffer("Hello");
		info(sb2);
		
		System.out.println("\n---StringBuffer(5)-------");
		StringBuffer sb3 = new StringBuffer(5);
		info(sb3);
		
		System.out.println("\n---Apple추가-------");
		sb3.append("Apple");
		
		System.out.println(sb3);
		info(sb3);
		
		System.out.println("\n---Banana추가-------");
		sb3.append("Banana");
		
		System.out.println(sb3);
		info(sb3);
		
		//--------------------------------------------
		// sb3에 작업!
		
		// 5번째 인덱스에 "Orange" 넣고 출력 - insert
		System.out.println("\n---insert-------");
		sb3.insert(5, "Orange");
		System.out.println("sb3 : " + sb3);
		
		// 3번째 인덱스 삭제하고 출력 - deleteCharAt
		System.out.println("\n---deleteCharAt-------");
		sb3.deleteCharAt(3);
		System.out.println("sb3 : " + sb3);
		
		// substring(1, 7) 결과 출력
		// sb3 출력
		// info 출력
		System.out.println("\n---substring-------");
		String sub = sb3.substring(1,7);
		System.out.println(sub);
		info(sb3);
		
		// trimToSize() 수행
		// info 출력
		System.out.println("\n---trimToSize-------");
		sb3.trimToSize();
		info(sb3);
		
		// reverse() 호출 후 결과 출력
		System.out.println("\n---reverse-------");
		sb3.reverse();
		System.out.println("sb3 : " + sb3);

		
		
	} //main end
	
	//전달받은 StringBuffer 객체의 length와 capacity를 출력한다
	public static void info( StringBuffer s ) {
		System.out.println("length : " + s.length());
		System.out.println("capacity : " + s.capacity());
	}
}















