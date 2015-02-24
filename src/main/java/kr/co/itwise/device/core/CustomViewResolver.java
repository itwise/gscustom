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
		this.setCache(false);
		System.out.println("viewName : " + viewName);
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
		
		String originViewName = viewName + "";

		Cookie viewCookie = WebUtils.getCookie(request, "viewType");
		
		String viewType = (viewCookie == null) ? "" : viewCookie.getValue();
		System.out.println("viewType : " + viewType);
		Cookie displayGroupCookie = WebUtils.getCookie(request, "displayGroup");
		String displayGroupType = (displayGroupCookie == null) ? "" : displayGroupCookie.getValue();
		
		if(!"".equals(viewType)){
			if(viewType.equals("mobile")){
				viewName += "_NM";
			}else{
				viewName += "_W";
			}
		}else{
			if("N".equals(displayGroupType) || "M".equals(displayGroupType)){
				viewName += "_NM";
			}else{
				viewName += "_W";
			}
		}
		String viewFile = "";
		viewFile = request.getRealPath(this.getPrefix() + viewName + this.getSuffix());

		File regFile = new File(viewFile);
		
		if(!regFile.exists()){
			System.out.println("not exist View File");
			viewName = originViewName;
		}

		System.out.println("resolving view file: " + viewName);
		request.setAttribute("viewName", viewName);
		InternalResourceView view = (InternalResourceView)super.buildView(viewName);
		//view.setAlwaysInclude(false);		
		return view;
	}
}
