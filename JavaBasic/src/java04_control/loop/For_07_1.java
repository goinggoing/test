package java04_control.loop;

public class For_07_1 {
	public static void main(String[] args) {

		int account = 0;
		for( int i=0, money=10; i<15; i++, account+=money, money*=2 );
		
		System.out.println("저축한 총 금액 : " + account + "원");
		
	}
}












