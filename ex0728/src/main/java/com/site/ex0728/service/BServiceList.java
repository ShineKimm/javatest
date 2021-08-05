package com.site.ex0728.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0728.dao.BoardDao;
import com.site.ex0728.vo.BoardVo;

public class BServiceList implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao boardDao = new BoardDao();
		String category="";
		String keyword="";
		if(request.getParameter("keyword")!=null) {
			category = request.getParameter("category"); //all,btitle,bcontent
			keyword = request.getParameter("keyword");  //사진
		}
		//listcount 총게시글 수 38, 검색되어진 게시글 수 12
		int	listcount = boardDao.boardCountSelect(category,keyword);
		System.out.println("listcount : "+listcount);
		
		//하단 넘버링
		int page=1; //blist에서 page값이 넘어오지 않았을때
		//blist에서 page값이 넘어왔을때
		if(request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int limit=10; //한페이지에 게시글수는 10개,15개,20개....
		int numlimit=10; //하단 넘버링 개수 5,10
		int maxpage = (int)((double)listcount/limit+0.99);
		int startpage = (((int)((double)page/numlimit+0.99))-1)*numlimit+1;
		int endpage = startpage+numlimit-1;
		if(endpage>maxpage) endpage=maxpage;   // 1-10 maxpage: 4 이면 1-4
		request.setAttribute("page", page);
		request.setAttribute("limit", limit);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("category", category);
		request.setAttribute("keyword", keyword);
		
		//게시글 내용검색
		int startrow = (page-1)*limit+1;
		int endrow = startrow+limit-1;
		ArrayList<BoardVo> list = boardDao.boardAllSelect(startrow,endrow,category,keyword);
		request.setAttribute("list", list);
	}

}
