package kr.co.itwise.device.core;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

public class DeviceTypeInterceptor implements HandlerInterceptor{
	

	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Cookie displayGroupCookie = WebUtils.getCookie(request, "displayGroup");
		
		String displayGroup = (displayGroupCookie == null) ? "" : displayGroupCookie.getValue();
		
		if("".equals(displayGroup)){
			String userAgentString = request.getHeader("User-Agent");
			//1. ua header parser
			String displayGroupType = UAStringParser.parse(userAgentString);
			
			//1-1. 파싱이 불가능한 경우(Redirection)
			if("".equals(displayGroupType)){
				response.addCookie(new Cookie("parsingType" ,"redirection"));
				String redirectUrl = request.getRequestURI();
				response.sendRedirect(request.getContextPath() + "/dummy?redirect=" + redirectUrl);
				return false;	
			}else {
				response.addCookie(new Cookie("parsingType" ,"UA"));
			}
			//2. displayGroup cookie write
			Cookie cookie = new Cookie("displayGroup", displayGroupType);
			cookie.setMaxAge(60*60*24*7);
			cookie.setPath("/");
			
			response.addCookie(cookie);
			
		}
		return true;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
