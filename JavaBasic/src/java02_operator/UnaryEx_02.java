package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {

		//단항연산자 - 증감
		//	++ : 증가연산자
		//	-- : 감소연산자
		
		//	피연산자로 적용된 변수의 값을 1 증감시킨다

		int num;
		
		num = 15; //15로 초기화
		System.out.println(num); //원본
		System.out.println(num--); //연산 중, 후위, 후치
		System.out.println(num); //연산 후

		System.out.println("---------");
		
		num = 15; //15로 초기화
		System.out.println(num); //원본
		System.out.println(--num); //연산 중, 전위, 전치
		System.out.println(num); //연산 후

		
		
		// 변수의 값을 1 증가시키기
		int n = 13;
		
		n = n + 1;
		n += 1;
		n++; //이걸 많이 사용함
		
	}
}











