package com.huntlab.ongo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.pieroxy.ua.detection.Bot;
import net.pieroxy.ua.detection.OS;
import net.pieroxy.ua.detection.UserAgentDetector;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest req, HttpServletResponse resp) {
		logger.info("requestUserAgent()");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/get/useragent")
	public ModelAndView requsetUserAgent(HttpServletRequest req, HttpServletResponse resp) {
		ModelAndView mav = new ModelAndView();
		
		// User Agent detector Lib 추가 - O
		
		// User Agent Class에서 추출
//		UserAgentDetector userAgent = new UserAgentDetector();
//		userAgent.parseUserAgent("OS");
//		System.out.println(userAgent.VERSION);
		
		
		
		
		// Vo 객체 추가
		
		// Vo 객체에 담기
		
		// Attribute에 vo 객체 담기
		
		
		return mav;
	}
}
