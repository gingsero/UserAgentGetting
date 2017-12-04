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

import net.pieroxy.ua.detection.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("index.do")
	public String index(HttpServletRequest req, HttpServletResponse resp) {
		logger.info("index()");
		return "index";
	}
	
	@RequestMapping("get/useragent.do")
	public ModelAndView requsetUserAgent(HttpServletRequest req, HttpServletResponse resp) {
		logger.info("requsetUserAgent()");
		ModelAndView mav = new ModelAndView();
		
		String userAgent = req.getHeader("user-agent");
		String userFrom = req.getHeader("from");
		System.out.println("User Info : " + userAgent);
		System.out.println("User Info : " + userFrom);
		
		// User Agent detector Lib 추가 - O
		
		// User Agent Class에서 추출
		UserAgentDetector detector = new UserAgentDetector();
		detector.test();
		
		System.out.println("detector Version : " + detector.VERSION);
		// session header 를 String으로 담아서 처리해줘야 할 필요 있음.
		
		
		
//		userAgent.parseUserAgent("OS");
//		System.out.println(userAgent.VERSION);
		
		
		
		
		// Vo 객체 추가
		
		// Vo 객체에 담기
		
		// Attribute에 vo 객체 담기
		
		
		return mav;
	}
}
