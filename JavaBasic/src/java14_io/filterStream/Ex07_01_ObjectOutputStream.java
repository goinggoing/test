package java14_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable : 직렬화 가능 클래스로 만들기
class Point implements Serializable {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}

public class Ex07_01_ObjectOutputStream {
	public static void main(String[] args) {
		
		//파일 객체 선언 
		File file = new File("./src/java14_io/filterStream", "ObjectTest.ser");
		
		//스트림 선언
		ObjectOutputStream oos = null;
		
		try {
			//스트림 생성
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file) ));
			
			//출력 대상 객체
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			//출력
			oos.writeObject(p1);
			oos.flush();

			oos.writeObject(p2);
			oos.writeObject(p3);
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














