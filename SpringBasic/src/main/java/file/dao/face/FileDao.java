package file.dao.face;

import java.util.List;

import file.dto.Filetest;

public interface FileDao {

	/**
	 * 전달된 파일정보를 삽입
	 * 
	 * @param filetest - 업로드된 파일의 정보
	 */
	public void insertFile(Filetest filetest);
	
	/**
	 * 업로드 파일 전체 조회
	 * 
	 * @return - 업로드된 파일 목록
	 */
	public List<Filetest> selectAll();
	
	/**
	 * fileno를 이용한 조회
	 * 
	 * @param fileno - 조회할 파일 번호
	 * @return Filetest - 조회된 파일 정보
	 */
	public Filetest selectByFileno(int fileno);
}














