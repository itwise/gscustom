package kr.co.itwise.device.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.itwise.device.product.ProductList;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/main.gs")
	public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("index/main");
		mav.addObject("messageUrl", "TEST");
		return mav;
	}
	
	@RequestMapping(value="/dummy")
	public ModelAndView goDummyPage(){
		ModelAndView mav = new ModelAndView("client-device-sender");

		return mav;
	}
	
	@RequestMapping(value="/dummy", method = RequestMethod.POST)
	public ModelAndView getDeviceInfo(@RequestParam("deviceWidth") int deviceWidth
			, @RequestParam(value = "redirect", required = false, defaultValue = "") String redirect
			, @RequestParam("deviceHeight") int deviceHeight
			, @RequestParam("deviceRatio") int deviceRatio
			, HttpServletRequest request
			, HttpServletResponse response){
		//ModelAndView mav = new ModelAndView("blank");
		System.out.println("redirect : " + redirect);
		Device device = DeviceUtils.getCurrentDevice(request);
		Cookie cookie;
		if(device.isNormal()){
			cookie = new Cookie("viewType", "normal");
		}else{
			cookie = new Cookie("viewType", "mobile");
		}
		cookie.setMaxAge(60*60*24*7);
		cookie.setPath("/");
		response.addCookie(cookie);
		
		if("".equals(redirect)){
			return new ModelAndView("redirect:/main.gs");
		}else{
			// FIXME 임시처리
			redirect = redirect.replace("/DeviceTypeDetector/", "");
			return new ModelAndView("redirect:/" + redirect);
		}
	}
	
	@RequestMapping(value="/test")
	public ModelAndView goTestPage(){
		ModelAndView mav = new ModelAndView("test");
		return mav;
	}
	
	@RequestMapping(value="/shop.gs")
	public ModelAndView shopPage() {
		ModelAndView mav = new ModelAndView("shop/main");
		mav.addObject("productList", new ProductList().getProduct());
		return mav;
	}
	
	@RequestMapping(value="/product.gs")
	public ModelAndView productPage() {
		ModelAndView mav = new ModelAndView("shop/product");
		mav.addObject("product", new ProductList().getProduct().get(0));
		return mav;
	}

}
