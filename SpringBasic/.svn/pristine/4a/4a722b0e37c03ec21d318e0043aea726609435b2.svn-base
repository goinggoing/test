package web.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dao.face.BoardDao;

@Controller
public class BoardController {

	@Autowired BoardDao boardDao;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/board/info", method=RequestMethod.GET)
	public void info(Model model) {
		
		logger.info("마이바티스 테스트");
		
		List<HashMap<String, Object>> map = boardDao.select();
		
		logger.info(map.toString());
		
		model.addAttribute("map", map);
		
	}
	
}











