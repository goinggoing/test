package java14_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class Ex08_01_ObjectOutputStream {
	public static void main(String[] args) {
		
		//파일 객체 선언 
		File file = new File(
				"./src/java14_io/filterStream",
				"ObjectTest2.ser");

		//스트림 객체 선언
		ObjectOutputStream oos = null;
		
		try {
			//스트림 객체 생성
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file) ));
			
			List list = new ArrayList<>();
			
			list.add( new Point(10,20) );
			list.add( new Person("Alice", 22) );
			list.add( new Point(55,66) );
			list.add( new Person("Bob", 33) );
			list.add( new Person("Clare", 44) );
			
			//List 객체 출력
			oos.writeObject( list );
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)	oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}












