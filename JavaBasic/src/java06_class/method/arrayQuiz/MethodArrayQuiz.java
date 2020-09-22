package java06_class.method.arrayQuiz;

public class MethodArrayQuiz {
	
	public void mul10(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] *= 10;
		}
	}
	public void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public int[] mul10_v2(int[] arr) {
		int[] retArr = new int[arr.length];
		for(int i=0; i<retArr.length; i++) {
			retArr[i] = arr[i] * 10;
		}
		return retArr;
	}
	
}













