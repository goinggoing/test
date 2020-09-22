package java06_class.method.arrayQuiz;

public class MethodArrayQuizEx {
	public static void main(String[] args) {
		MethodArrayQuiz maq = new MethodArrayQuiz();
		
		int[] arr = {1,2,3,4,5};
		//1. 배열의 모든 요소 10배(원본, main의 arr이 변경됨)
		maq.mul10(arr);
		
		//2. 배열의 모든 요소 출력
		maq.print(arr);
		
		
		System.out.println("------------------------");
		int[] arr2 = {6,7,8,9,10};
		
		//1.원본배열(main의 arr2)은 그대로 두고
		//	모든 요소를 10배한 새로운 배열(깊은복사 개념) 반환
		int[] res = maq.mul10_v2(arr2);
		
		//2. 배열의 모든 요소 출력
		maq.print(arr2);
		maq.print(res);
		
	}
}






