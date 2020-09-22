package interceptor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorAdminController {

	private static final Logger logger = LoggerFactory.getLogger(InterceptorAdminController.class);

	@RequestMapping(value="/interceptor/admin/main")
	public void adminMain() { }

	@RequestMapping(value="/interceptor/admin/fail")
	public void adminFail() { }

}










