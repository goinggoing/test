package file.service.face;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import file.dto.Filetest;

public interface FileService {

	/**
	 * 업로드된 파일을 처리
	 * 
	 * @param title - 제목
	 * @param file - 파일 정보 객체
	 */
	public void filesave(String title, MultipartFile file);

	/**
	 * 업로드된 파일 목록 조회
	 * 
	 * @return - 조회된 파일 목록
	 */
	public List<Filetest> list();

	/**
	 * 파일번호를 이용하여 파일정보를 조회한다
	 * 
	 * @param fileno - 지정된 파일 번호
	 * @return Filetest - 조회된 파일 정보
	 */
	public Filetest getFile(int fileno);
}













