package web.service.face;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import web.dto.Board;
import web.dto.Comment;
import web.dto.Filetest;
import web.dto.Recommend;
import web.util.Paging;

public interface BoardService {
	
	/*
	 * 요청 파라미터 inData 파싱
	 * Board TB와 curPage 값을 이용한 paging 객체를 생성하고 반환
	 * 
	 * @param indata - 요청 정보 객체
	 * @return Paging - 페이징 정보
	 * 
	 */
	public Paging getPaging(Paging inData);
	
	/*
	 * 페이징 정보를 활용하여 보요질 게시글 목록 조회
	 * 
	 * @param Paging - 페이징 정보
	 * @return List - 게시글 목록
	 */
	public List<Board> list(Paging paging);
	
	/*
	 * boardno를 가진 viewBoard로 상세정보 조회
	 * 
	 * @param viewBoard - boardno를 가진 객체
	 * @return Board - board 상세정보
	 */
	public Board boardView(Board viewBoard);
	
	/*
	 * 글쓰기
	 * 
	 * @param board - 요청 정보 객체
	 */
	public void write(Board board, MultipartFile file);
	
	/*
	 * 글 수정
	 * 
	 * @param board - 수정한 정보 객체(제목, 본문)
	 */
	public void update(Board board);
	
	/*
	 * 글 삭제
	 * 
	 * @param board - boardno를 가진 객체
	 */
	public void delete(Board board);
	
	/*
	 * 첨부 파일 얻기
	 * 
	 * @param board - 첨부파일을 조회할 게시글 번호 객체
	 * @return Filetest - 게시글에 첨부된 파일 정보
	 */
	public Filetest viewFile(Board board);
	
	/**
	 * 파일번호를 이용하여 파일정보를 조회한다
	 * 
	 * @param fileno - 지정된 파일 번호
	 * @return Filetest - 조회된 파일 정보
	 */
	public Filetest getFile(int fileno);
	
	/**
	 * 게시글 추천 상태 조회
	 * 
	 * @param recommend - 추천 상태 체크 객체
	 * @return boolean - true:추천 상태, false:추천하지않은 상태
	 */
	public boolean isRecommend(Recommend recommend);
	
	/**
	 * 추천 정보 파라미터 얻기
	 * 
	 * @param board - 요청 정보 객체
	 * @return Recommend - 추천 정보 객체
	 */
	public Recommend getRecommend(Board board, HttpSession session);
	
	/**
	 * 추천 토글
	 * 
	 * @param recommend - 추천 정보 객체
	 * @return boolean - true:추천 성공, false:추천취소 성공
	 */
	public boolean recommend(Recommend recommend);
	
	/**
	 * 게시글의 총 추천 수 구하기
	 * 
	 * @param recommend - 해당 게시글
	 * @return int - 총 추천 수
	 */
	public int getTotalRecommend(Recommend recommend);
	
	/**
	 * 댓글 리스트
	 * 
	 * @param board - 댓글이 조회될 게시글
	 * @return List - 댓글 리스트
	 */
	public List<Comment> getCommentList(Board board);
	
	/**
	 * 댓글 입력
	 * 
	 * @param comment - 삽입될 댓글
	 */
	public void insertComment(Comment comment);
	
	/**
	 * 댓글 삭제
	 *  
	 * @param comment - 삭제할 댓글
	 * @return boolean - 삭제 성공 여부
	 */
	public boolean deleteComment(Comment comment);
	
	/*
	 * 게시판 리스트 삭제
	 * 
	 * @param names - 지울 boardno를 문자열로 합친 것
	 */
	public void boardListDelete(String names);
	
	

}
