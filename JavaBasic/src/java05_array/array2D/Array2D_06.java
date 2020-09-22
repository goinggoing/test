package java05_array.array2D;

public class Array2D_06 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		
		System.out.println("길이 : " + arr.length);
		
		int[] backup = arr;
		
		arr = new int[3];
		System.out.println("길이 : " + arr.length);

		// int[3]로 만들어진 새로운 배열을 참조하면서
		//이전의 int[5] 배열은 아무도 참조하지 않게 된다
		
		// 이러한 아무도 참조하지 않는 동적할당공간을 GC가 해제한다
		//	Garbage Collector
	}
}













