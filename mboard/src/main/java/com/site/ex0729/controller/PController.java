package com.site.ex0729.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0729.service.BService;
import com.site.ex0729.service.MService;
@WebServlet("/PController")
public class PController extends HttpServlet {
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI();
		String cpath = request.getContextPath();
		String fileUrl = uri.substring(cpath.length());
		
		MService mService = null;
		BService bService = null;
		
		RequestDispatcher dispatcher = null;
		if (fileUrl.equals("/member/login.do")) {
			System.out.println(fileUrl);
//			mService = new MServiceLogin();
			mService.excute(request, response);
			dispatcher = request.getRequestDispatcher("login.jsp");
		}else if(fileUrl.equals("/member/dologin.do")) {
			mService.excute(request, response);
			dispatcher = request.getRequestDispatcher("dologin.jsp");
		}
		dispatcher.forward(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
