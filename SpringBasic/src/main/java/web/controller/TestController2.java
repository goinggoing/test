package web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.dao.face.TestDao;
import web.dto.Test;

@Controller
public class TestController2 {
	
	@Autowired TestDao testDao;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController2.class);
	
	@RequestMapping(value="/test/test2", method=RequestMethod.GET)
	public void test() {}
	
	@RequestMapping(value="/test/testProcess2", method=RequestMethod.GET)
	public ModelAndView testProcess(ModelAndView mav, @RequestParam(value="year") int year, @RequestParam(value="DW") char DW ) {
		
		Map map = new HashMap();
		
		map.put("DW", DW);
		map.put("year", year);
		
		logger.info("map(선택한 년도, 선택한 일/요일" + map);
		logger.info("-----------------------------");
		
		List<Map> list2 = testDao.selectDW(map);
		
		logger.info("list(선택한 것에 대한 리스트) " + list2);

		mav.addObject("list2",list2);
		mav.setViewName("jsonView");
		
		return mav;
	}
	
	@RequestMapping(value="/test/test2", method=RequestMethod.POST)
	public String testPost(Model model
						, @RequestParam HashMap<String, Object> map //전달 파라미터 맵
//						, @Param("year") int year
//						, @Param("DW") char DW
						) {
		
		testDao.insert(map);
		
		logger.info("liftForm --------- " + map);
		
		List<Test> list2 = testDao.selectTest(map);
		logger.info("listForm --------- " + list2);

		model.addAttribute("list2", list2);
		
		return "test/test2";
	}
	
	
	
}


