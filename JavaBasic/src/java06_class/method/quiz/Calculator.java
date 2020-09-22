package java06_class.method.quiz;

public class Calculator {

	//µ¡¼À
	public int sum(int n1, int n2) {
		return n1+n2;
	}

	//»¬¼À
	public int sub(int n1, int n2) {
		return n1-n2;
	}
	
	//°ö¼À
	public int mul(int n1, int n2) {
		return n1*n2;
	}
	
	//³ª´°¼À
	public double div(double n1, double n2) {
		if( n2 != 0 ) {
			return n1/n2;
		} else {
			System.out.println("[ERROR] 0À¸·Î ³ª´­ ¼ö ¾ø½À´Ï´Ù");
			return 0.0;
		}
	}
	
}













