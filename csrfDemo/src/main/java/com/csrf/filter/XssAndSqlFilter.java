package com.csrf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.csrf.util.XssHttpServletRequestWrapper;

public class XssAndSqlFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		/**
		 * 
		 */
		System.out.println("初始化xss过滤器");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		chain.doFilter(new XssHttpServletRequestWrapper(request), response);
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
