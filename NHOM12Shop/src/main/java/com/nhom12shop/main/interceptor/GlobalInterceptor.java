package com.nhom12shop.main.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.nhom12shop.main.entity.Categories;
import com.nhom12shop.main.service.CategoriesService;

@Component
public class GlobalInterceptor implements HandlerInterceptor{
	@Autowired 
	private CategoriesService categoriesService;
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		request.setAttribute("categories", categoriesService.findAll());
	}
}
