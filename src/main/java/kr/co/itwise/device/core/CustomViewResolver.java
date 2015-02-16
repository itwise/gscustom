package kr.co.itwise.device.core;

import java.io.File;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.util.WebUtils;

public class CustomViewResolver extends InternalResourceViewResolver{
	
	protected AbstractUrlBasedView buildView(String viewName) throws Exception{
		System.out.println("viewName : " + viewName);
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		
		String originViewName = viewName + "";

		Cookie viewCookie = WebUtils.getCookie(request, "viewType");
		System.out.println(viewCookie);
		String viewType = (viewCookie == null) ? "" : viewCookie.getValue();
		
		if(viewType.equals("mobile")){
			viewName += "_NM";
		}else{
			viewName += "_W";
		}
		String viewFile = "";
		viewFile = request.getRealPath(this.getPrefix() + viewName + this.getSuffix());

		File regFile = new File(viewFile);
		if(!regFile.exists()){
			viewName = originViewName;
		}

		InternalResourceView view = (InternalResourceView)super.buildView(viewName);
		view.setAlwaysInclude(false);
		return view;
	}
}
