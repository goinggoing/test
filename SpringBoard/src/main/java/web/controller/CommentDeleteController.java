package web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.Comment;
import web.service.face.BoardService;

@Controller
public class CommentDeleteController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommentDeleteController.class);
	
	@Autowired private BoardService boardService;
	
	@RequestMapping(value="/comment/delete", method=RequestMethod.POST)
	public void commentDelete(Comment comment, HttpServletResponse res) {
		
		boolean success = boardService.deleteComment(comment);
		
		try {
			res.getWriter().append("{\"success\":"+success+"}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
