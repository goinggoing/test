package java04_control.switchEx;

public class Switch_02 {
	public static void main(String[] args) {
		
		int num=20;
		
		//비교대상은 연산식으로 넣을 수 있다
		switch ( num-5 ) {
		case 10:
			System.out.println("1번");
			break;

		case 15:
			System.out.println("2번");
			break;

		case 20:
			System.out.println("3번");
			break;
		}
		
	}
}
















