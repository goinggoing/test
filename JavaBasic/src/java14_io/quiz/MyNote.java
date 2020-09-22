package java14_io.quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyNote {
	
	private Scanner sc = new Scanner(System.in);
	
	//노트 저장 경로
	private static final String path = "./src/java14_io/quiz/note";
	
	public MyNote() { }
	
	public void fileSave() {
		System.out.println(" + + 새로운 노트 + +");
		System.out.println();
		
		
		// ----- 노트 입력 받기 -----
		System.out.println("파일에 저장할 내용을 입력하시오");

		StringBuilder sb = new StringBuilder(); //노트
		String str = null; //노트 임시 저장

		while( true ) {
			str = sc.nextLine(); //입력한 문자열 한 줄
			
			if("exit".equals(str))	break; // "exit"를 입력할 때까지 반복
			
			sb.append(str); //노트 변수에 저장
			sb.append('\n'); //개행 추가
		}
		// -------------------------
		

		// ----- 노트 저장 의사 묻기 -----
		System.out.print("저장하시겠습니까? (y/n) : ");
		
		char input = sc.nextLine().charAt(0); // y/n 선택 문자
		
		if( input != 'y' && input != 'Y' ) { // 'y'/'Y' 가 아니면 중단
			return;
		}
		// ------------------------------
		
		
		// ----- 노트 파일명 입력받기 -----
		System.out.print("저장할 파일명(.txt 자동생성) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //노트 저장할 파일
		// ------------------------------

		
		// ----- 출력 스트림 -----
		PrintWriter out = null;
		// -------------------------

		
		try {
			// ----- 노트 내용 저장하기 -----
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)), true); //autoFlush
			
			out.append(sb, 0, sb.length()); //노트 저장
			
			//노트 저장 성공
			System.out.println();
			System.out.println("\t>> " + filename + ".txt 파일에 성공적으로 저장하였습니다.");
			// ------------------------------
			
		} catch (IOException e) {
//			e.printStackTrace();

			//노트 파일 스트림 생성 실패
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt 파일은 정상적인 파일이 아닙니다.");

		} finally {
			if(out!=null)	out.close(); //스트림 닫기
		}
	} // fileSave() 끝
	
	
	
	public void fileOpen() {
		System.out.println(" + + 노트 불러오기 + +");
		System.out.println();

		
		// ----- 노트 파일명 입력받기 -----
		System.out.print("열기할 파일명(.txt 제외) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //노트 저장할 파일
		if( !file.exists() || !file.isFile() ) { //파일이 아니거나 없으면 중단
			System.out.println();
			System.out.println("\t>> [SYSTEM] 파일명이 잘못되었습니다");
			return;
		}
		// ------------------------------

		
		// ----- 입력 스트림 -----
		BufferedReader in = null;
		// -------------------------

		
		try {
			// ----- 노트 불러오기 -----
			in = new BufferedReader(new FileReader(file));

			String str = null;
			while( (str=in.readLine()) != null ) {
				System.out.println(str);
			}
			// -------------------------

			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			
			//노트 파일 불러오기 실패
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt 파일을 불러오는 데 실패하였습니다.");

		} catch (IOException e) {
//			e.printStackTrace();
			
			//노트 내용 읽기 실패
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt 파일을 읽어들일 수 없습니다.");

		} finally {
			try {
				if(in!=null)	in.close(); //스트림 닫기
			} catch (IOException e) {
//				e.printStackTrace();
				
				System.out.println();
				System.out.println("\t>> [SYSTEM] 파일읽기를 정상적으로 종료할 수 없습니다.");
			}
		}
	} // fileOpen() 끝
	
	
	
	public void fileEdit() {
		System.out.println(" + + 노트 수정하기 + +");
		System.out.println();
		
		
		// ----- 노트 파일명 입력받기 -----
		System.out.print("수정할 파일명(.txt 제외) : ");
		String filename = sc.nextLine();
		
		File file = new File(path, filename+".txt"); //노트 저장할 파일
		if( !file.exists() || !file.isFile() ) { //파일이 아니거나 없으면 중단
			System.out.println();
			System.out.println("\t>> [SYSTEM] 파일명이 잘못되었습니다");
			return;
		}
		// ------------------------------

		
		// ----- 입출력 스트림 선언 -----
		BufferedReader in = null;
		PrintWriter out = null;
		// -------------------------
		
		
		try {
			// ----- 원본 파일 내용 읽어오기 -----
			in = new BufferedReader(new FileReader(file));
			
			int len = -1;
			char[] cbuf = new char[1024];
			StringBuilder sb = new StringBuilder();
			while( (len = in.read(cbuf)) != -1 ) {
				sb.append(cbuf, 0, len);
			}
			// -----------------------------------

			
			// ----- 노트 변경사항 입력 받기 -----
			String str = null; //노트 임시 저장
			while( true ) {
				str = sc.nextLine(); //입력한 문자열 한 줄
				
				if("exit".equals(str))	break; // "exit"를 입력할 때까지 반복

				sb.append(str); //노트 변수에 저장
				sb.append('\n'); //개행 추가
			}
			// -----------------------------------
			
			
			// ----- 노트 저장 의사 묻기 -----
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			char input = sc.nextLine().charAt(0); // y/n 선택 문자
			if( input != 'y' && input != 'Y' ) { // 'y'/'Y' 가 아니면 중단
				return;
			}
			// ------------------------------
			
			
			// ----- 변경 내용 반영하기 -----
			out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)), true);//autoFlush
			
			out.append(sb); //변경내용 저장
			
			//노트 저장 성공
			System.out.println();
			System.out.println("\t>> " + filename + ".txt 파일의 내용이 변경되었습니다.");
			// ------------------------------
			
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			
			//노트 파일 불러오기 실패
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt 파일을 불러오는 데 실패하였습니다.");
			
		} catch (IOException e) {
//			e.printStackTrace();
			
			//노트 파일 스트림 생성 실패
			System.out.println();
			System.out.println("\t>> [SYSTEM] " + filename + ".txt 파일은 정상적인 파일이 아닙니다.");

		} finally {
			try {
				if(in!=null)	in.close(); //입력 스트림 닫기
			} catch (IOException e) {
//				e.printStackTrace();
				
				System.out.println();
				System.out.println("\t>> [SYSTEM] 파일읽기를 정상적으로 종료할 수 없습니다.");
			}
			
			if(out!=null)	out.close(); //출력 스트림 닫기
		}
	} // fileEdit() 끝
	
}





