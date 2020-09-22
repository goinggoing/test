package java10_api;

public class StringEx {
	public static void main(String[] args) {
		
		String str1 = "Apple";
		String str2 = new String("Banana");
		
		System.out.println("---length()-------");
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		
		System.out.println("Cherry의 길이 : " + "Cherry".length());
		
		System.out.println("\n---equals()-------");
		System.out.println("str1.equals(str2) : "
				+ str1.equals(str2) );
		System.out.println("Apple.equals(str1) : "
				+ "Apple".equals(str1) );
		
		System.out.println("\n---toLowerCase()-------");
		// str1 문자열을 모두 소문자로 변환하여 리턴
		
		String lower = str1.toLowerCase();
		System.out.println("str1 : " + str1);
		System.out.println("lower : " + lower);
		
		
		System.out.println("\n---toUpperCase()-------");
		// str2 문자열을 모두 대문자로 변환하여 리턴
		System.out.println("str2의 대문자 변환 : "
				+ str2.toUpperCase());
		System.out.println("원본 : " + str2);
		
		
		System.out.println("\n---charAt-------");
		// "Hello Java"에서 J 값 얻어서
		// char변수 ch에 저장, 출력 (charAt)
		char ch = "Hello Java".charAt(6);
		System.out.println(ch);
		
		System.out.println("\n---concat-------");
		// str1에 ", HIHIHI" 라는 문자열 추가하고 출력
		String concat = str1.concat(", HIHIHI");
		System.out.println(concat);

		System.out.println("\n---replace-------");
		// str1의 'A'을 'a'로 변환
		String replace1 = str1.replace('A', 'a');
		System.out.println(replace1);
				
		System.out.println("\n---replace-------");
		// str1에서 "ple"를 "PLE"로 변환
		String replace2 = str1.replace("ple", "PLE");
		System.out.println(replace2);
		
		System.out.println("\n---substring-------");
		// str1에서 "pl" 찾아서 출력 (substring)
		String substr = str1.substring(2,4);
		System.out.println(substr);
		
		System.out.println("\n---contains-------");
		// str1에 "pP"가 있는지 판별
		System.out.println( str1.contains("pP") );
		System.out.println( str1.contains("pp") );		
	}
}


















