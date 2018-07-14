package com.csrf.base;

import com.csrf.conn.ResultCode;

public class CodeConstant {
	public static final ResultCode CSRF_ERROR = new ResultCode("101", "CSRF ERROR:无效的token，或者token过期");
}
