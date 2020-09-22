package java14_io.quiz;

import java.util.Scanner;

public class TestMyNote {
	
	public static final int SAVE = 1;
	public static final int OPEN = 2;
	public static final int EDIT = 3;
	public static final int EXIT = 4;
	
	public static void main(String[] args) {
		
		menu();
		
	} // main() 끝
	
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);

		MyNote note = new MyNote();
		
		int sel = 0; // 메뉴 선택
		do {
			System.out.println();
			System.out.println("******   MyNote  *******");
			System.out.println("  1. 노트 새로 만들기");
			System.out.println("  2. 노트 열기");
			System.out.println("  3. 노트 열어서 수정하기");
			System.out.println("  4. 끝내기");
			System.out.println();
			System.out.print("\t>> ");
			
			sel = sc.nextInt();
			
			System.out.println();
			System.out.println();
			switch (sel) {
			case SAVE:
				note.fileSave();
				break;
				
			case OPEN:
				note.fileOpen();
				break;
				
			case EDIT:
				note.fileEdit();
				break;
				
			case EXIT:
				System.out.println("감사합니다.");
				break;
			}
			
		} while( sel != EXIT );
	} // menu() 끝
	
}
