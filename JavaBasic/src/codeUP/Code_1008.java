package codeUP;

//다음 문장을 출력하세요
// ┌┬┐

// ├┼┤

// └┴┘
//ㅂ + 한자 : 선문자 입력


public class Code_1008 {
	
	public void print() {

		String hi = "";
		hi += "┌┬┐\n";
		hi += "\n├┼┤\n";
		hi += "\n└┴┘";
		
		System.out.printf(hi);
			
	}
	
	public static void main(String[] args) {
		
		Code_1008 a = new Code_1008();
		
		a.print();
		
	}
	
}


