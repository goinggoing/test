package java04_control.switchEx;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch문, 선택문
		//	switch-case 문
		
//		switch( 비교대상 ) {
//		case 값1:
//		case 값2:
//		case 값3:
//			...
//		default:
//		}
		// 비교대상에 저장된 값과 case에 지정된 값이 같으면
		//해당 case구문 위치부터 코드가 실행된다
		
		// 지정된 case에 해당하는 값이 없으면 default로 간다
		
		// default: 는 생략가능
		
		int num=30;
		switch (num) {
		case 30:
			System.out.println("num은 30");
			break;
			
		case 10:
			System.out.println("num은 10");
			break;
			
		case 20:
			System.out.println("num은 20");
			break;
			
		default:
			System.out.println("디폴트: 10, 20, 30 다 아님");
		}
	}
}
















