package web.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import web.dto.User;

@Controller
public class ParamController {

	private static final Logger logger = LoggerFactory.getLogger(ParamController.class);

	@RequestMapping(value="/param/requestParam", method=RequestMethod.GET)
	public String paramForm(
			 ) {

		logger.info("요청 성공");
		
		return "param/paramForm";
		
	}
	
	@RequestMapping(value="/param/requestParam", method=RequestMethod.POST)
	public String paramResult(
			Model model, //모델객체
			@ModelAttribute User user,
			
			@RequestParam(defaultValue="unknown", required=false) String data,
			@RequestParam(defaultValue = "999", required = false) int age) {
		
		logger.info(data);
		logger.info("" + age);
		
		
		logger.info("POST 동작");
//		logger.info("name : " + name);
		logger.info("age : " + age);
		logger.info( user.toString() );
		
		model.addAttribute("u", user);
		//req.setAttribute("u", user); 와 같은 기능
				
		model.addAttribute("data", "넣고싶은 거, 전달하고 싶은 거");
		
		return "param/paramResult";
	}
	
	@RequestMapping(value="/param/mapForm", method=RequestMethod.GET)
	public void paramTestForm() { }
	
	@RequestMapping(value="/param/mapResult")
	public void mapResult(
			@RequestParam HashMap<String,String> map //전달 파라미터 맵
			, Model model //MODEL 관리 객체
			) {
		
		logger.info( map.toString() );
		
		model.addAttribute("map", map);
		model.addAllAttributes(map);
	}
	
	@RequestMapping(value="/param/test", method=RequestMethod.GET)
	public void paramTest(Model model) {
		model.addAttribute("data", "MODEL DATA");
	}
	
	@RequestMapping(value="/param/test2", method=RequestMethod.GET)
	public String paramTest2(Model model) {
		model.addAttribute("data", "MODEL DATA2");

		return "param/test";
	}
	
	@RequestMapping(value="/param/test3", method=RequestMethod.GET)
	public ModelAndView paramTest3(ModelAndView mav) {

		//MODEL 과 VIEW 를 한번에 지정하는 객체
//		ModelAndView mav = new ModelAndView();
		
		//모델값 설정
		mav.addObject("data", "MAV 객체 모델값");
		
		//viewName 지정
		mav.setViewName("param/test");
		
		//ModelAndView 객체 반환
		return mav;
	}
	
}















