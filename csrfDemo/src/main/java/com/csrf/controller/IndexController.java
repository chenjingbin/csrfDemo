package com.csrf.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csrf.note.RefreshCSRFToken;
import com.csrf.note.VerifyCSRFToken;

@Controller
public class IndexController {
	@RefreshCSRFToken 
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request) {
		System.out.println("se==>"+request.getParameter("se"));
		return "index";
	}
	@RequestMapping("/")
	public String index(HttpServletRequest request){
		return "index";
	}
	@VerifyCSRFToken
	@RequestMapping("/demo")
	public String demo(){
		return "index2";
	}
}
