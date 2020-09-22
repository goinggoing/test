package java06_class.method.quiz;

public class MethodQuiz {

	//Q1. 1~100출력
//	mq.print100();
	public void print100() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	//Q2. 1~입력값까지출력
//	mq.printHello( sc.nextInt() ); 
	public void printHello(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("Hello");
		}
	}
	//Q3. 입력한 횟수만큼 입력한 텍스트 출력
//	mq.printText(cnt, text);
	public void printText(int cnt, String text) {
		for(int i=0; i<cnt; i++) {
			System.out.println(text);
		}
	}
}














