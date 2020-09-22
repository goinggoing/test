package java14_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		//class File
		//	파일 정보를 다루는 클래스
		//	-> 파일을 입출력대상으로 사용할 수 있게 된다
		
//		File file = new File("D:/Test.txt"); //존재하지 않는 파일
		File file = new File("D:/FileTest.txt"); //존재하는 파일
		
		System.out.println("file : " + file); // toString()
		System.out.println("length : " + file.length());
		System.out.println("exists : " + file.exists());
		
		System.out.println("---------------------");
		System.out.println("canRead : " + file.canRead());
		System.out.println("canWrite : " + file.canWrite());
	
		System.out.println("---------------------");
		System.out.println("isDirectory : " + file.isDirectory());
	}
}











