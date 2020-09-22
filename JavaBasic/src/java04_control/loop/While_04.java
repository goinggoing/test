package java04_control.loop;

public class While_04 {
	public static void main(String[] args) {
		
		int i=0;
		while( i<100 ) {
			i++;

			if( i%2==0 ) {	continue; }
			if( i>10 ) {	break; }
			
			System.out.println(i);
		}
		
		
	}
}












