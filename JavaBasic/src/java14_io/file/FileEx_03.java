package java14_io.file;

import java.io.File;

public class FileEx_03 {
	public static void main(String[] args) {
		
		// class File 의 생성자 
		
		//		File(String path, String filename)
		//		File(File path, String filename)
		
		//		File(String filepath)
		
		File file = new File(
				"D:/workspace/JavaBasic/src/java14_io/file"
				, "Hello");
		
		System.out.println( file.length() );
		System.out.println( file.exists() );
		
		System.out.println("-----------------------");
		
		File path = new File("D:/workspace/JavaBasic/src/java14_io/file");
		String filename = "Hello";
		
		File file2 = new File( path, filename );
		System.out.println( file2.length() );
		System.out.println( file2.exists() );
		
	}
}













