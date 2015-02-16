package kr.co.itwise.device.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.DeviceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/main")
	public ModelAndView mainPage(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("main");
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
			, @RequestParam("deviceHeight") int deviceHeight
			, @RequestParam("deviceRatio") int deviceRatio
			, HttpServletRequest request
			, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("blank");
		
		Device device = DeviceUtils.getCurrentDevice(request);
			
		if(device.isNormal()){
			
		}else{
			
			
		}
		
		return mav;
	}
	
	@RequestMapping(value="/test")
	public ModelAndView goTestPage(){
		ModelAndView mav = new ModelAndView("test");
		return mav;
	}

}
