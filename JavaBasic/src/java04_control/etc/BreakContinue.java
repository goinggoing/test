package java04_control.etc;

public class BreakContinue {
	public static void main(String[] args) {
		
		//break
		//	제어문을 중단시키는 역할을 수행
		//	if문은 중단시키지 않는다
		//	가장 가까운 영역의 { }블록을 가진 제어문을 중단시킨다
		
		for( int i=0; i<100; i++ ) {
			System.out.println(i);
			
			if( i==5 ) {
				break;
			}
		}
		
		
		System.out.println("----------");
		//continue
		//	loop(반복문)에서 사용되는 기타제어문
		//	다음 반복으로 넘긴다
		//	for문에서는 continue를 만나면 즉시 증감문으로 넘어간다
		
		for(int i=0; i<10; i++) {
			
			if( i==3 ) {
				continue;
			}
			
			System.out.println(i);
		}

	}
}














