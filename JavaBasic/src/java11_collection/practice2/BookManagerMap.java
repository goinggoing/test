package java11_collection.practice2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BookManagerMap {

	private HashMap<String, Book> booksMap;
	
	public BookManagerMap() {
		booksMap = new HashMap<>();
	}
	
	public BookManagerMap(HashMap<String, Book> map) {
		this.booksMap = map;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//맵에 객체 추가, 도서번호를 키로 사용함
	public void putBook(Book book) {
		booksMap.put(book.getbNo(), book);
	}

	//맵에서 객체 제거
	public void removeBook(String key) {	
		booksMap.remove(key);
	}
	
	//도서명이 일치하는 객체의 도서번호를 리턴
	//도서명이 객체가 맵에 없으면, null 리턴함
	public String searchBook(String bTitle) { //entrySet() 사용
		Set keys = booksMap.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = booksMap.get(iter.next());
			
			if( bTitle.equals(currentBook.getTitle()) ) {
				return currentBook.getbNo();
			}
		}
		
		return null;
	}
	
	//맵정보 모두 출력 : keySet() 사용
	public void displayAll() {
		System.out.println(" + + + 모든 책 정보 + + +");
		System.out.println("번호\t카테고리\t제목\t저자");
		
		Set keys = booksMap.keySet();
		Iterator<String> iter = keys.iterator();
		
		while(iter.hasNext()) {
			Book currentBook = booksMap.get(iter.next());
			
			System.out.print(currentBook.getbNo() + "\t");
			System.out.print(getCategoryText(currentBook.getCategory()) + "\t");
			System.out.print(currentBook.getTitle() + "\t");
			System.out.println(currentBook.getAuthor() + "\t");
		}
		
	}
	
	private String getCategoryText(int category) {
		switch(category) {
		case 1:
			return "인문\t";
		case 2:
			return "자연과학";
		case 3:
			return "의료\t";
		case 4:
			return "기타\t";
		default:
			return null;
			
		}
	}
	
	//key에 해당하는 Book 출력
	public void printBook(String key) {
		
	}
}
















