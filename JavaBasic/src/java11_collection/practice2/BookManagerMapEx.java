package java11_collection.practice2;

import java.util.HashMap;
import java.util.Scanner;

public class BookManagerMapEx {
	
	private static final Scanner sc = new Scanner(System.in);

	private static final BookManagerMap bmMap = new BookManagerMap();

	//메뉴 상수
	private static final int NEW = 1;
	private static final int DEL = 2;
	private static final int SEARCH = 3;
	private static final int PRINT = 4;
	private static final int SORT = 5;
	private static final int EXIT = 6;
	
	public static void main(String[] args) {

		menu();

		
		
		//테슷흐
//		HashMap<String, Book> testMap = new HashMap<>();
//		testMap.put("100001", new Book("100001", 1, "인문서적1", "인문저자1"));
//		testMap.put("200005", new Book("200005", 2, "자연과학1", "자연과학저자1"));
//		testMap.put("400004", new Book("400004", 4, "기타서적1", "기타저자1"));
//		testMap.put("100009", new Book("100009", 1, "인문학정의2", "인문저자2"));
//		testMap.put("300007", new Book("300007", 3, "의료와기기1", "의료저자1"));
//		testMap.put("200003", new Book("200003", 2, "자연과학2", "자연과학저자2"));
//		
//		BookManagerMap bmMapTest = new BookManagerMap(testMap);
//		bmMapTest.displayAll();
//		
//		bmMapTest.putBook(new Book("400010", 4, "기타서적이요", "기타저자3"));
//		bmMapTest.putBook(new Book("400011", 4, "기타기타기타", "기타저자4"));
//		
//		Book tmp = inputBook();
//		bmMapTest.putBook(tmp);
//		
//		bmMapTest.displayAll();
//		
//		System.out.println("-----");
//		System.out.println("인문서적1 : " + 
//				bmMapTest.searchBook("인문서적1") );
//		System.out.println("없는 책 : " + 
//				bmMapTest.searchBook("없는 책") );
//		
//		System.out.println( bmMapTest.searchBook(inputBookTitle()) );
//		
	
	}
	
	public static void menu() {
		
		int sel=0;
		
		do {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println();
			System.out.println(" 1. 새 도서 추가");
			System.out.println(" 2. 도서 삭제");
			System.out.println(" 3. 도서 검색 출력");
			System.out.println(" 4. 전체 출력");
			System.out.println(" 6. 종료");
			
			sel = sc.nextInt();
			
			switch(sel) {
			case NEW:
				break;
				
			case DEL:
				break;
				
			case SEARCH:
				break;
				
			case PRINT:
				break;
				
			case SORT:
				break;
				
			case EXIT:
				break;
			}
			
		} while( sel != EXIT );
	}
	
	//Book 객체의 필드값을 키보드로 입력받아 초기화하고 객체 리턴
	public static Book inputBook() {
		Book book = new Book();
		
		System.out.println(" + + + 새로운 책 정보 입력 + + +");
		System.out.print("책 번호 : ");
		book.setbNo( sc.nextLine() );
		
		System.out.print("카테고리(1.인문/2.자연과학/3.의료/4.기타) : ");
		book.setCategory( sc.nextInt() );
		sc.nextLine();
		
		System.out.print("책 제목: ");
		book.setTitle( sc.nextLine() );
		
		System.out.print("책 저자 : ");
		book.setAuthor( sc.nextLine() );
		
		return book;
	}
	
	//삭제 또는 검색을 위한 도서 타이틀을 키보드로 입력받아 리턴
	public static String inputBookTitle() {
		System.out.print("도서명을 입력하세요 : ");
		return sc.nextLine();
	}
}






















