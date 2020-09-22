package web.dao.face;

import java.util.List;
import java.util.Map;

import web.dto.AttchfileDts;
import web.dto.AttchfileMst;
import web.dto.RotSteMng;

public interface RotSteDao {
	
	/*
	 * 2020-08-20 지재용
	 * 
	 * @return List - 게시글 목록
	 */
	public List<RotSteMng> selectList(Map<String, String> map);
	
	/*
	 * 2020-08-20 지재용
	 * 
	 * @param rotSte - 작성한 부패신고내용
	 */
	public void insertRotSte(RotSteMng rotSte);

	/**
	 * 리스트에서 게시정보 삭제하기
	 * 
	 * @param names - 삭제한 파일순번 목록들 문자열
	 */
	public void deleteList(String fileSeq);
	
	/*
	 * 2020-08-21 지재용
	 * 
	 *  첨부파일 테이블에 들어갈 게시글 번호를 미리 추출
	 * 
	 * @return int
	 */
	public int getFileSeq();
	
	/*
	 * 2020-08-21 지재용
	 *  
	 * 마스터 첨부 파일
	 *  
	 *  @param fileMst - 업로드된 첨부파일 내용
	 */
	public void insertFileMst(AttchfileMst fileMst);
	
	/*
	 * 2020-08-21 지재용
	 *  
	 * 디테일 첨부 파일
	 *  
	 *  @param fileDts - 업로드된 첨부파일 내용
	 */
	public void insertFileDts(AttchfileDts fileDts);
	
	/**
	 * 마스터 첨부파일 db 삭제
	 * 
	 * @param names - 삭제할  파일순번 목록들 문자열
	 */
	public void deleteFileMst(String fileSeq);

	/**
	 * 디테일 첨부파일 db 삭제하기
	 * 
	 * @param names - 삭제할 파일 순번 목록들 문자열
	 */
	public void deleteFileDts(String fileSeq);
	
	/**
	 * 첨부파일 리스트 조회
	 * 
	 * @param fileSeq - 첨부파일을 조회할 파일번호 문자열로 받은것
	 * @return AttchfileDts - 조회된 첨부파일
	 */
	public List<AttchfileDts> selectFileList(String fileSeq);
	
	/**
	 * 첨부파일 조회
	 * 
	 * @param seq - 파일번호
	 * @return AttchfileDts - 조회된 첨부파일
	 */
	public AttchfileDts selectFile(int seq);
	
}
