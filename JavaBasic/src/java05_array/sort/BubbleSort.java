package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		//버블 정렬	
		//	1. 각 ROUND의 알고리즘
		//	 0번째 인덱스와 인접한 2개를 비교 (0인덱스, 1인덱스)
		//	왼쪽의 데이터가 크면 스왑한다
		//	 이런 방법으로 마지막 요소까지 진행(반복)
		
		//	2. 1번 알고리즘을 이용해서 모든 요소가 정렬될 때까지 반복
		//	 각 ROUND가 진행될 때마다 1개의 요소가 정렬된 상태가 됨
		//	각 ROUND가 진행되면 정렬해야하는 요소의 수가 1개씩 줄어듦
		
		int[] arr = {3,2,5,4,1};
		
		// --- 원본 출력 ---
		System.out.println("--- 정렬 전 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// -----------------
		
		// --- 버블 정렬 ---
		for(int i=0; i<arr.length-1; i++) { //ROUND 반복
			for(int j=0; j<arr.length-1-i; j++) {//각 ROUND 코드, 스왑진행
				if( arr[j] > arr[j+1] ) { //오름차순 정렬
					//스왑
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
			
			//각 라운드 동작이후 출력해보기
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
		// -----------------

		// --- 정렬 이후 출력 ---
		System.out.println("--- 정렬 후 ---");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// -----------------
		
	}
}












