package ajax.controller;

import java.io.IOException;
import java.io.Writer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ajax.dto.ResultData;

@Controller
public class AjaxController {

	private static final Logger logger = LoggerFactory.getLogger(AjaxController.class);

	//1. 응답 출력 스트림으로 JSON TEXT를 직접 출력하기
	@RequestMapping(value="/ajax/test01")
	public void ajaxTest01() { }

	@RequestMapping(value="/ajax/test01_ok")
	public void ajaxTest01_ok(Writer out) {
		logger.info("AJAX TEST 01 요청 확인");
		
		try {
			out.write("{\"data\":true}");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	
	//2. @ResponseBody를 이용하여 객체를 JSON Text로 응답하기
	//	jackson-databind 라이브러리가 필요함
	@RequestMapping(value="/ajax/test02")
	public void ajaxTest02() { }

	@RequestMapping(value="/ajax/test02_ok")
	public @ResponseBody ResultData ajaxTest02_ok() {
		logger.info("AJAX TEST 02 요청 성공");

		ResultData rd = new ResultData();
		rd.setData1("APPLE");
		rd.setData2(12345);
		
		return rd;		
	}
	
	
	
	
	//3. AJAX의 응답으로 JSP 응답을 활용하기
	//	 전달해야하는 데이터를 MODEL 값으로 JSP에 전달하고
	//	완성된 HTML로 응답되도록 만들기
	//	InternalResourceViewResolver를 이용한다
	@RequestMapping(value="/ajax/test03")
	public void ajaxTest03() { }

	@RequestMapping(value="/ajax/test03_ok")
	public String ajaxTest03_ok(Model model) {
		logger.info("AJAX TEST 03 요청 성공");
		
		ResultData rd = new ResultData();
		rd.setData1("Banana");
		rd.setData2(85758485);
		
		model.addAttribute("rd", rd);
		
		return "ajax/test03_ok_response";
		
	}
	
	
	//4. json를 생성하는 전용 View 만들기
	//	jsonView라는 이름으로 Bean을 등록하고 사용함
	//	BeanNameViewResolver를 사용함
	@RequestMapping(value="/ajax/test04")
	public void ajaxTest04() { }

	@RequestMapping(value="/ajax/test04_ok")
	public ModelAndView ajaxTest04_ok(ModelAndView mav) {
		logger.info("AJAX TEST 04 요청 성공");
		
		//모델 객체 값
		ResultData rd = new ResultData();
		rd.setData1("Cherry");
		rd.setData2(4127367);
		
		//모델값으로 지정
		mav.addObject("rd", rd);
		
		//viewName 지정하기
		mav.setViewName("jsonView");
		
		return mav;
	}

}














