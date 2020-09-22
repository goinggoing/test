package web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import web.dao.face.DynamicQueryDao;
import web.dto.CheckBoxTest;

@Controller
public class DynamicQueryController {
	
	private static final Logger logger = LoggerFactory.getLogger(DynamicQueryController.class);
	
	@Autowired DynamicQueryDao dynamicQueryDao;
	
	@RequestMapping(value="/dynamic/query1")
	public void dynamicQuery1() {
		logger.info("ㅌㅅㅌ");
		
		List<String> list = new ArrayList<>();
		list.add("C");
		list.add("F");
		list.add("D");
		System.out.println(list);
		HashMap<String, Object> map= new HashMap<>();
		map.put("dataList", list);
		System.out.println(map);
		dynamicQueryDao.select(map);
		
	}
	
	@RequestMapping(value="/dynamic/query2", method=RequestMethod.GET)
	public void dynamicQuery2() { }

	@RequestMapping(value="/dynamic/query2", method=RequestMethod.POST)
	public void dynamicQuery2Proc(
			@RequestParam(value="check") String chk,
			String[] check,
			CheckBoxTest c
			) {
		
		logger.info(chk);
		logger.info(Arrays.toString(check));
		logger.info(c.toString());
		
		dynamicQueryDao.select2(c);
		
	}

}









