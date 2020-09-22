package web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import web.dto.Board;
import web.dto.Comment;
import web.dto.Filetest;
import web.dto.Recommend;
import web.service.face.BoardService;
import web.util.Paging;

@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired private BoardService boardService;
	
	@RequestMapping(value="/board/list")
	public void list(Paging inData, Model model) {
		
		//페이징 계산
		Paging paging = boardService.getPaging(inData);
		
		model.addAttribute("paging", paging);
		
		//게시글 목록
		List<Board> list = boardService.list(paging);
		model.addAttribute("list", list);
		
	}
	
	@RequestMapping(value="/board/view", method=RequestMethod.GET)
	public String view( Board viewBoard, Model model, HttpSession session) {
		 
		//게시글 번호가 1보다 작으면 목록으로 보내기
		if(viewBoard.getBoardNo() < 1) {
			return "redirect:/board/list";
		}
		 
		//게시글 상세 정보 전달
		viewBoard = boardService.boardView(viewBoard);
		model.addAttribute("view", viewBoard);
		
		//첨부파일 전달
		Filetest filetest = boardService.viewFile(viewBoard);
		model.addAttribute("filetest", filetest);
		
		//추천상태 전달
		Recommend recommend = new Recommend();
		recommend.setBoardNo(viewBoard.getBoardNo());
		recommend.setId((String) session.getAttribute("id"));
		
		boolean isRecommend = boardService.isRecommend(recommend);
		model.addAttribute("isRecommend", isRecommend);
		
		//댓글 리스트 전달
		Comment comment = new Comment();
		List<Comment> commentList = boardService.getCommentList(viewBoard);
		model.addAttribute("commentList", commentList);
		
		return "board/view";
		
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.GET)
	public void write() {}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String writeProcess(Board board, MultipartFile file,	HttpSession session) {
		
		// 작성자 아이디 추가
		board.setWriterId((String)session.getAttribute("id"));
		
		boardService.write(board, file);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/update", method=RequestMethod.GET)
	public void update(Board board, HttpSession session, Model model) {
		
		board = boardService.boardView(board);
		model.addAttribute("view", board);	
	}
	
	@RequestMapping(value="/board/update", method=RequestMethod.POST)
	public String updateProcess(Board board) {
		
		boardService.update(board);
		
		return "redirect:/board/view?boardNo="+board.getBoardNo();
	}
	
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String deleteProcess(Board board, Model model) {
		
		boardService.delete(board);
		
		model.addAttribute("msg", "게시글 삭제 완료");
		model.addAttribute("url", "/board/list");
		
		return "util/alert";
		
	}
	
	@RequestMapping(value="/board/download")
	public ModelAndView download(
			int fileno,
			ModelAndView mav
			) {
		
		//파일 번호에 해당하는 파일 정보 가져오기
		Filetest file = boardService.getFile(fileno);
		
		//파일정보를 MODEL 값으로 지정하기
		mav.addObject("downFile", file);
		
		//viewName 지정하기
		mav.setViewName("down");
		
		return mav;
	}
	
	
	
}
