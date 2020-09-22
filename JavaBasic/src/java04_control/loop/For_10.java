package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {

		//중첩 for loop
		//	2~9단 구구단
		
		//바깥쪽 for loop -> 몇 단인지 결정
		for( int dan=2; dan<=9; dan++ ) { //dan, 2~9, 8번
			System.out.println("----- " + dan + "단 -----");
			
			//안쪽 for loop -> 각 단의 구구단 출력
			for( int i=1; i<=9; i++ ) { //i, 1~9, 9번
				System.out.println( "  "+dan+" x "+i+" = "+(dan*i) );
			}
			
			System.out.println(); //줄바꿈
		}
	
	}
}


















