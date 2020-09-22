package java03_scanner;

public class FormattedDoubleEx {
	public static void main(String[] args) {
		
		// 소수점 셋째자리 반올림 출력
		
		double avg = 34.56778896;
		System.out.println( Math.round(avg*100)/(double)100 );
		
		System.out.println( String.format("%.2f", avg) );

		System.out.printf("%.2f", avg );

	}
}












