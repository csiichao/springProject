package com.yunlovec.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * SpringBoot整合Filter方式二 
 *
 */
public class SecondFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("进入secondFilter");
		chain.doFilter(request, response);
		System.out.println("离开secondFilter");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
