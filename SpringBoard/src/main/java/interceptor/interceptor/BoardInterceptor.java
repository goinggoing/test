package interceptor.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class BoardInterceptor  extends HandlerInterceptorAdapter{
	
	private static final Logger logger = LoggerFactory.getLogger(BoardInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		logger.info("+ + + 인터셉터 + + +");
		
		//세션 객체
		HttpSession session = request.getSession();
		
		if(session.getAttribute("login") == null){
			logger.info(" >> 접속 불가: 비 로그인 상태");
			response.sendRedirect("/interceptor/writeFail");
			return false;
			
		} else {
			logger.info(" >> 정상적인 접근: 로그인 상태");
			return true;
		}
		
		
	}
	
	
}
