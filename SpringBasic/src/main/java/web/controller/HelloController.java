package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //스프링컨트롤러 등록 어노테이션
public class HelloController {

	//Logger 객체
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	// HTTP 요청& 응답을 처리하는 컨트롤러 메소드
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hello(String data, int age) {
		
		logger.info("요청 성공");
		logger.info("data : " + data);
		logger.info("age : " + age);
		
//		logger.trace("트레이스");
//		logger.debug("디버그");
//		logger.info("인포메이션");
//		logger.warn("워닝");
//		logger.error("에러");

		return "test/hello";
		
	}
	
}












