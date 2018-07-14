package com.csrf.interceptor;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.HtmlUtils;

import com.csrf.util.XssHttpServletRequestWrapper;

public class XssInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("------>>>>");
		/*Map map = request.getParameterMap();
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Object object  = iterator.next();
			Object value = map.get(object);
			if(value instanceof String){
				String string = (String) value;
				String htmlEscape = HtmlUtils.htmlEscape(string, "UTF-8");
			}
		}*/
		XssHttpServletRequestWrapper xssRequest= new XssHttpServletRequestWrapper(request);
		return super.preHandle(xssRequest, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}

}
