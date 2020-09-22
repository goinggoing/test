package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		//배열 복사하기
		int[] arr1 = {10,20,30}; //원본, Source
		int[] arr2; //사본, Destination

		//깊은 복사(deep copy)
		//	 참조 대상의 내용물(실 데이터)를 새로운 공간에
		//	복사하는 것

		// 1. 복사될 공간 확보(생성)
		arr2 = new int[arr1.length];
		
		// 2. 데이터 복사 ( System클래스의 배열 복사 API 기능 이용 )
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("--- 데이터 수정 전 ---");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}

		arr1[1] = 777; //arr1의 데이터만 수정
		
		System.out.println("--- 데이터 수정 후 ---");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
	}
}













