package java09_innerClass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface Anonymous {
	public void out();
}

public class AnonymousEx {
	public static void main(String[] args) {
		
		Anonymous a01;
		
		a01 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명 객체 1번");
			}
		};
		a01.out();
		
		Anonymous a02;
		a02 = new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명 객체 2번");
			}
		};
		a02.out();
		
		// ----------------------------------------------
		
		MouseEvent me; //마우스 이벤트 객체
		
		MouseListener ml;
		ml = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println();
			}
		};
		
		// ------------------------------------------
		
		new Anonymous() {
			@Override
			public void out() {
				System.out.println("익명 객체 3번");
			}
		}.out();
	}
}















