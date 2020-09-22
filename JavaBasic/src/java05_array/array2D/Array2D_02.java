package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		//1차원 배열의 선언과 동시에 초기화
		int[] arr1D = { 1,2,3,4,5 };
		
		//2차원 배열의 선언과 동시에 초기화
		int[][] arr2D ={
				{ 1,2,3 },
				{ 4,5,6 },
				{ 7,8,9 }
		};
		//3행 3열의 2차원 배열 생성
		
		
		//2차원 배열의 값 대입하기
		for( int i=0; i<3; i++ ) { //i행
			for( int j=0; j<3; j++ ) { //j행
				arr2D[i][j] = (i+1)*10 + (j+1);
			}
		}
		
		//2차원 배열의 값 출력하기
		for( int i=0; i<3; i++ ) { //i행
			
			for( int j=0; j<3; j++ ) { //j열
				System.out.print(arr2D[i][j] + " "); //열 출력
			}
			
			System.out.println(); //행마다 줄바꾸기
		}

	}
}













