package web.dao.face;

import java.util.List;

import web.dto.Board;
import web.dto.Filetest;
import web.util.Paging;

public interface BoardDao {
	
	/*
	 *	검색어를 이용한 총 게시글 수를 조회
	 *
	 *	@return int - 총 게시글 수
	 */
	public int selectCntAll(String search);
	
	/*
	 * 페이지에서 리스트를 조회
	 * 
	 * @param Paging - 페이징 객체
	 * @return List - 게시글 목록
	 */
	public List<Board> selectPageList(Paging paging);
	
	/*
	 * 조회수
	 * 
	 * @param viewBoard - viewBoard객체 
	 */
	public void updateHit(Board viewBoard);

	/*
	 * 상세 페이지
	 * 
	 * @param viewBoard - boardno를 가진 객체
	 * @return Board - 상세페이지 정보
	 */
	public Board selectBoardByBoardNo(Board viewBoard);
	
	/*
	 *  글쓰기
	 *  
	 *  @param board - 작성한 내용 객체
	 */
	public void write(Board board);
	
	/*
	 * 글 수정
	 * 
	 * @param board - 글쓰기 수정한 정보 객체
	 */
	public void update(Board board);
	
	/*
	 * 굴 삭제
	 * 
	 * @param board - boardno를 가진 삭제 대상 객체
	 */
	public void delete(Board board);
	
	/**
	 * 다음 게시글 번호 반환
	 * 	게시글 테이블과 첨부파일 테이블에 들어갈 게시글 번호를 미리 추출
	 * 
	 * @return int
	 */
	public int selectBoardNo();
	
	/*
	 *  첨부파일 입력
	 *  
	 *  @param filetest - 업로드된 첨부파일 내용
	 */
	public void insertFile(Filetest filetest);
	
	/**
	 * 게시글에 첨부된 파일 기록 삭제
	 * 
	 * @param board - 삭제할 게시글번호를 담은 객체
	 */
	public void deleteFile(Board board);
	
	/**
	 * 첨부파일 조회
	 * 
	 * @param board - 첨부파일을 조회할 게시글 객체
	 * @return Filetest - 조회된 첨부파일
	 */
	public Filetest selectFile(Board board);
	
	/**
	 * fileno를 이용한 조회
	 * 
	 * @param fileno - 조회할 파일 번호
	 * @return Filetest - 조회된 파일 정보
	 */
	public Filetest selectByFileno(int fileno);
	
	/*
	 * 리스트에서 게시글의 첨부파일 삭제하기
	 * 
	 * @param names - 삭제한 게시글 번호 목록들 문자열
	 */
	public void deleteBoardFileList(String names);
	
	/**
	 * 리스트에서 게시글 삭제하기
	 * 
	 * @param names - 삭제한 게시글 번호 목록들 문자열
	 */
	public void deleteBoardList(String names);
	

	
	

}
