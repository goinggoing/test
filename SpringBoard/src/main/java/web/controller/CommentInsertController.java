package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Comment;
import web.service.face.BoardService;

@Controller
public class CommentInsertController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommentInsertController.class);

	@Autowired private BoardService boardService;
	
	
	@RequestMapping(value="/comment/insert", method=RequestMethod.POST)
	public String commentInsert(Comment comment) {
		
		boardService.insertComment(comment);
		
		return "redirect:/board/view?boardNo=" + comment.getBoardNo();
		
	}
	
}
