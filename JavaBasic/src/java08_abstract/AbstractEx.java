package java08_abstract;

import javax.management.InstanceAlreadyExistsException;

abstract class Person { //부모클래스
	protected String name; //이름
	
	public abstract void display();
	
	public Person(String name) {
		this.name = name;
	}
}
class Professor extends Person { //자식클래스 
	private String major; //전공
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major +"전공");
	}
}
class Student extends Person { //자식클래스
	private String subject; //과목
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject; 
	}
	
	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + " 수강");
	}
}

public class AbstractEx {
	public static void main(String[] args) {
		
		Student s = new Student("Alice", "자바");
		Professor p = new Professor("Bob", "컴퓨터공학");
		
		s.display();
		p.display();
		
		System.out.println("-----------------");
		
		Person p1 = new Student("Clare", "자료구조");
		Person p2 = new Professor("Dave", "컴퓨터과학");
		
		p1.display();
		p2.display();
		
		System.out.println("-------------------");
		
		Person[] arr = null;
		arr = new Person[3];
		
		arr[0] = new Professor("Apple", "Banana");
		arr[1] = new Student("Cherry", "Durian");
		
		for(int i=0; i<arr.length; i++) {
			if( arr[i] != null) {
				arr[i].display();
			}
		}
		
		arr[2] = new Student("E", "Fruit");
		
		System.out.println("--------------");
		// foreach문
//		for( 자료형 변수 : 배열 ) {
//			// 배열의 요소들이 변수에 차례대로
//			//대입되며 반복하는 코드
//		}

		for( Person person : arr ) {
			person.display();
		}
		
		System.out.println("-----------");
		
		int[] a = { 4,6,34,68,5,6,3,3,4,6 };
		for( int n : a ) {
			System.out.println(n);
		}
		
	}
}














