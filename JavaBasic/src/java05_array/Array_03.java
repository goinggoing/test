package java05_array;

public class Array_03 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		
		//배열의 요소의 개수, 배열의 길이, 크기
		System.out.println("배열의 길이 : " + arr.length);
		
		//배열의 길이를 이용한 배열 전체 출력
		for( int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}
		
		//------------------------------------------
		
		// arr의 인덱스 0~4
		
//		arr[5] = 99; //ArrayIndexOutOfBoundsException
		// arr.length 보다 크거나 같은 인덱스를 접근할 때 발생
		
//		int[] arr2 = new int[-10];
		// NegativeArraySizeException
		// 배열의 크기를 음수로 지정했을 때 발생
		
		arr[-5] = 20; //ArrayIndexOutOfBoundsException
		
	}
}












