//소스코드가 포함된 패키지를 나타냄
package java01_variables;


//주석, Comment
//	소스코드에 부가적인 설명을 적기 위해 사용하는 문법 요소

// 한 줄 주석 - //의 오른쪽 한 줄을 주석처리한다

/* 문장 주석
 * 
 * 	여러 줄이더라도 시작점부터 끝점까지 주석처리한다
 *  
 *  */

public class VariablesEx_01 {//클래스 (프로그램의 기본 구성요소, 객체지향)
	
	//메인 메소드 - 프로그램의 시작점
	public static void main(String[] args) {
		
		int number; // 변수 선언 - 변수 공간 생성하기
		
		number = 13; // 변수에 값 대입하기 - 변수 공간에 데이터 저장하기
		
		System.out.println( number ); //모니터에 변수에 저장된 값을 출력하기
		
		System.out.println( 13 ); //13이라는 데이터를 모니터에 출력하기

	}//메인의 끝 - 프로그램의 종료점
}//클래스 정의 끝


//처음부터 한 줄 주석 토클 단축키
//	ctrl + shift + c
