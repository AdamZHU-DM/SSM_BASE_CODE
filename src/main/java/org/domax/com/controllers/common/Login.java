package org.domax.com.controllers.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
* @author Adam/朱静宁
* @version 创建时间：Apr 10, 2020 12:31:06 PM
* @ClassName 类名称
* @Description 登录操作
*/
@Controller
@RequestMapping("/login")
public class Login {

	@PostMapping("/miniLogin")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	@ResponseBody
	public void login1() {

		System.out.println("=====111111====");
	}
	
}
