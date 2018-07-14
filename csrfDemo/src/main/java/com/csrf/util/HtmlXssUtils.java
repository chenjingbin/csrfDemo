package com.csrf.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class HtmlXssUtils {
	public static final String REGEP_ONE="";
	public static final String REGEP_TWO="";
	public static final String REGEP_THREE="";
	
	/**
	 * 去掉xss
	 * @param value
	 * @return
	 */
	public static String removeXssRegep(String value){
		String reslut = "";
		if( value != null && ! "".equals(value) ){
			Pattern pattern = Pattern.compile(REGEP_ONE);
			Matcher matcher = pattern.matcher(value);
			reslut = matcher.replaceAll("");
			pattern = Pattern.compile(REGEP_TWO);
			matcher = pattern.matcher(reslut);
			reslut = matcher.replaceAll("");
			pattern = Pattern.compile(REGEP_THREE);
			matcher = pattern.matcher(reslut);
			reslut = matcher.replaceAll("");
		}
		return reslut;
	}
}
