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
		String keyword="";
		String category="";
		if(request.getParameter("category")!=null) {
			keyword = request.getParameter("keyword"); // 사진 키워드
			category = request.getParameter("category"); //
		}
		//총게시글수, 검색되어진 게시글수
		int	listcount = boardDao.boardCountSelect(category,keyword);
		//listcount 총게시글 수
		System.out.println("listcount"+listcount);
		int page = 1; //blist에서 page값이 넘어오지 않았을때
		if (request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		int limit = 10; //한페이지에 게시글수는 10개,15개,20개...
		int maxpage = (int)((double)listcount/limit+0.99);
		int startpage = (((int)((double)page/limit+0.99))-1)*limit+1;
		int endpage = startpage+10-1;
		if (endpage>maxpage) endpage = maxpage;
		request.setAttribute("page", page);
		request.setAttribute("limit", limit);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		request.setAttribute("category", category);
		request.setAttribute("keyword", keyword);
		
		int startrow = (page-1)*limit+1;
		int endrow = startrow + limit-1;
		
		ArrayList<BoardVo> list = boardDao.boardAllSelect(startrow,endrow,category,keyword);
		request.setAttribute("list", list);
	}

}
