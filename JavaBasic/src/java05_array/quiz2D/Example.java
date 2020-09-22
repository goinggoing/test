package java05_array.quiz2D;

public class Example {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int k = 1;
		
		//입력 (여기 고쳐서 해결할 것!)
		for (int i = 0; i < arr.length; i++) { //i행, 0~4
			for (int j = 0; j < arr[i].length; j++) { //j열, 0~4
		
				arr[i][j] = k++;
				
			}
		}

		//출력 (그대로 둘 것!)
		for (int i = 0; i < arr.length; i++) { //i행
			for (int j = 0; j < arr[i].length; j++) { //j열
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


