package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import web.dto.Board;
import web.dto.Recommend;
import web.service.face.BoardService;

@Controller
public class BoardRecommendController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired private BoardService boardService;
	
	@RequestMapping(value="/board/recommend")
	public ModelAndView recommend(Board board, HttpSession session, ModelAndView mav) {
		
		//추천 정보 얻기
		Recommend recommendParam = boardService.getRecommend(board, session);
		
		//추천 정보 토글
		boolean result = boardService.recommend(recommendParam);
		mav.addObject("result", result);
		
		//추천 수 조회
		int cnt = boardService.getTotalRecommend(recommendParam);
		System.out.println("총 추천수(추천con) :" + cnt);
		mav.addObject("cnt", cnt);
		
		//결과 JSON응답
		mav.setViewName("jsonView");
		
		return mav;
	}
	
	
}
