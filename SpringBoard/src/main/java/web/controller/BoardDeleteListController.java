package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.face.BoardService;

@Controller
public class BoardDeleteListController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardDeleteListController.class);
	
	@Autowired BoardService boardService;
	
	@RequestMapping(value="/board/listDelete", method=RequestMethod.POST)
	public String deleteList(@RequestParam() String names) {
		logger.info("체크박스 파라미터 names: " + names );
		if(!"".equals(names) && names != null) {
			boardService.boardListDelete(names);
		}

		return "redirect:/board/list";
		
	}
	
	
}
