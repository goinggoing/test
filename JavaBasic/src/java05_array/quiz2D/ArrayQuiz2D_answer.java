package java05_array.quiz2D;

public class ArrayQuiz2D_answer {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int k = 1;
		
		//입력 (여기 고쳐서 해결할 것!)
//		Q1
		for (int i = 0; i < arr.length; i++) { //i행, 0~4
			for (int j = 0; j < arr[i].length; j++) { //j열, 0~4
		
				arr[i][j] = k++;
				
			}
		}
		
//		Q2
//		for(int i=0; i<arr.length; i++) {
//			for(int j=4; j>=0; j--) {
//				arr[i][j] = k++;
//			}
//		}
		
//		Q3
//		for(int j=0; j<arr.length; j++) {
//			for(int i=0; i<arr.length; i++) {
//				arr[i][j] = k++;
//			}
//		}

//		Q3
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				arr[j][i] = k++;
//			}
//		}
		
//		Q4
//		for(int i=0; i<arr.length; i++) {
//			for(int j=4; j>=0; j--) {
//				arr[j][i] = k++;
//			}
//		}

//		Q4
//		for(int j=0; j<arr.length; j++) {
//			for(int i=4; i>=0; i--) {
//				arr[i][j] = k++;
//			}
//		}

		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr.length; i++) { //i행
			for (int j = 0; j < arr[i].length; j++) { //j열
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}






