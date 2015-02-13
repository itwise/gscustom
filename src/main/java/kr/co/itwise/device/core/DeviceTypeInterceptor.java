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
		Cookie viewCookie = WebUtils.getCookie(request, "viewType");
		System.out.println(viewCookie);
		String viewType = (viewCookie == null) ? "" : viewCookie.getValue();
		
		System.out.println("view Type : " + viewType);
		if("".equals(viewType)){
			String redirectUrl = request.getRequestURI();
			response.sendRedirect(request.getContextPath() + "/dummy?redirect=" + redirectUrl);
			return false;	
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
