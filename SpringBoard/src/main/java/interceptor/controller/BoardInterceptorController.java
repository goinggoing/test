package interceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardInterceptorController {

	private static final Logger logger = LoggerFactory.getLogger(BoardInterceptorController.class);

	@RequestMapping(value="/interceptor/writeFail")
	public void writeFail() { }
	
}
