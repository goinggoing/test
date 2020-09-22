package java05_array;

public class Array_01 {
	public static void main(String[] args) {
		
		//배열, array
		//	변수들의 묶음, 변수들의 나열
		int[] array = new int[100];
		array[50] = 100;
		
		
		//int형 변수 선언
		int num;
		num = 123; //변수에 값 대입
		
		//int형 배열 변수 선언
		int[] arr;
		arr = new int[5]; //int형 배열 생성
		
		//배열 생성 시 변수공간 묶음이 만들어짐
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; //ArrayIndexOutOfBoundsException
		
		for(int i=0; i<5; i++) {
			arr[i] = (i+1)*10;
		}
		
		for(int i=0; i<5; i++) {
			System.out.println( arr[i] );
		}
		
		System.out.println("---------");
		
		//배열의 이름은 배열이 메모리에 저장된 위치(주소)를 나타냄 ->참조값
		System.out.println( arr );
		
	}
}












