package com.site.ex0728.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0728.service.BService;
import com.site.ex0728.service.BServiceList;
import com.site.ex0728.service.MService;
import com.site.ex0728.service.MServiceDoLogin;


@WebServlet("*.do")
public class BController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("doAction");
		RequestDispatcher dispatcher=null;
		
		String uri = request.getRequestURI();
		String conpath = request.getContextPath();
		String urlName = uri.substring(conpath.length());
		MService mService=null;
		BService bService=null;
		if(urlName.equals("/member/login.do")) {
			dispatcher = request.getRequestDispatcher("login.jsp");
		}
		if(urlName.equals("/member/doLogin.do")) {
			mService = new MServiceDoLogin();
			mService.execute(request, response);
			dispatcher = request.getRequestDispatcher("doLogin.jsp");
		}
		if(urlName.equals("/board/blist.do")) {
			bService = new BServiceList();
			bService.execute(request, response);
			dispatcher = request.getRequestDispatcher("blist.jsp");
		}
		
		dispatcher.forward(request, response);
		
		
		
	}
	
	
	
	
	//------------------------------
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request,response);
	
	
	}

}
