package java14_io.file;

import java.io.File;

public class FileEx_02 {
	public static void main(String[] args) {
		
		//절대경로로 파일 지정
		//	루트 디렉토리로부터 파일까지 모든 경로를 다 적은 것
		File file = new File(
				"D:/workspace/JavaBasic/src/java14_io/file/Hello");
		
		System.out.println("length : " + file.length());
		System.out.println("exists : " + file.exists());

		System.out.println("-------------------------------");
		
		//상대경로로 파일 지정
		//	클래스패스(Classpath)로부터 파일까지 경로를 지정하는 것
		
		//	**클래스패스, Classpath
		//		프로그램이 실행된 위치
		//		 이클립스의 실행된 프로그램의 클래스패스는
		//		프로젝트 폴더로 설정된다
		
		File file2 = new File(
				"src/java14_io/file/Hello");
		
		System.out.println("length : " + file.length());
		System.out.println("exists : " + file.exists());
		
	}
}













