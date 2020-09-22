package web.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import web.dao.face.BoardDao;
import web.dao.face.CommentDao;
import web.dao.face.RecommendDao;
import web.dto.Board;
import web.dto.Comment;
import web.dto.Filetest;
import web.dto.Recommend;
import web.service.face.BoardService;
import web.util.Paging;

@Service
public class BoardServiceImpl implements BoardService {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Resource(name="boardDao") private BoardDao boardDao;
	@Autowired ServletContext context;
	@Autowired private RecommendDao recommendDao;
	@Autowired private CommentDao commentDao;
	
	@Override
	public Paging getPaging(Paging inData) {
		
		//검색어
		String search = inData.getSearch();
		int totalCount = boardDao.selectCntAll(search);
		
		//페이징 객체 생성
		Paging paging = new Paging(totalCount, inData.getCurPage());
		
		//검색어
		paging.setSearch(search);
		
		return paging;
	}

	@Override
	public List<Board> list(Paging paging) {
		// TODO Auto-generated method stub
		return boardDao.selectPageList(paging);
	}

	@Override
	public Board boardView(Board viewBoard) {
		
		boardDao.updateHit(viewBoard);
		
		return boardDao.selectBoardByBoardNo(viewBoard);
	}

	@Override
	public void write(Board board, MultipartFile file) {
		
		int boardNo = boardDao.selectBoardNo();
		logger.info("write next boardNo " + boardNo);
		logger.info("write next board" + board);
		board.setBoardNo(boardNo);
		logger.info("board boardNo" + boardNo);
		boardDao.write(board); //게시글 삽입
		
		//파일이 저장될 경로
		String storedPath = context.getRealPath("upload");
		
		//UUID
		String uid = UUID.randomUUID().toString().split("-")[4];
		
		//저장될 파일의 이름 (원본명 + UUID)
		String filename = file.getOriginalFilename()+"_"+uid;
		
		//저장될 파일 객체
		File dest = new File(storedPath, filename);
		
		try {
			file.transferTo(dest); //실제 파일 저장
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// DB에 저장 (업로드된 파일의 정보를 기록)
		Filetest filetest = new Filetest();
		
		filetest.setBoardNo(boardNo);
		filetest.setOriginName(file.getOriginalFilename());
		filetest.setStoredName(filename);
		
		boardDao.insertFile(filetest);
		
		
	}

	@Override
	public void update(Board board) {
		// TODO Auto-generated method stub
		boardDao.update(board);
		
	}

	@Override
	public void delete(Board board) {
		
		boardDao.deleteFile(board);
		
		boardDao.delete(board);
		
	}

	@Override
	public Filetest viewFile(Board board) {
		// TODO Auto-generated method stub
		return boardDao.selectFile(board);
	}

	@Override
	public Filetest getFile(int fileno) {
		// TODO Auto-generated method stub
		return boardDao.selectByFileno(fileno);
	}

	@Override
	public boolean isRecommend(Recommend recommend) {
		
		int cnt = recommendDao.selectStatusRecommend(recommend);
		
		if(cnt>0) { //추천 헀음
			
			return true;
		} else { //추천하지 않았음
			
			return false;
		}
		
		
	}

	@Override
	public Recommend getRecommend(Board board, HttpSession session) {
		
		//전달 파라미터 파싱
		int boardNo = board.getBoardNo();
		
		//로그인한 아이디
		String userId = (String)session.getAttribute("id");
		
		Recommend recommend = new Recommend();
		recommend.setBoardNo(board.getBoardNo());
		recommend.setId(userId);
		
		return recommend;
	}

	@Override
	public boolean recommend(Recommend recommend) {
		
		if( isRecommend(recommend)) { //추천한 상태
			
			recommendDao.deleteRecommend(recommend);
			
			return false;
		} else { //추천하지 않은 상태
			
			recommendDao.insertRecommend(recommend);
			
			return true;
		}
		
	}

	@Override
	public int getTotalRecommend(Recommend recommend) {
		// TODO Auto-generated method stub
		return recommendDao.selectTotalCntRecommend(recommend);
	}

	@Override
	public List<Comment> getCommentList(Board board) {
		// TODO Auto-generated method stub
		return commentDao.selectComment(board);
	}

	@Override
	public void insertComment(Comment comment) {
		// TODO Auto-generated method stub
		commentDao.insertComment(comment);
		
	}

	@Override
	public boolean deleteComment(Comment comment) {
		
		commentDao.deleteComment(comment); 
		
		if( commentDao.countComment(comment) > 0 ) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void boardListDelete(String names) {
		
		boardDao.deleteBoardFileList(names);
		
		boardDao.deleteBoardList(names);
		
	}

	
	
}
