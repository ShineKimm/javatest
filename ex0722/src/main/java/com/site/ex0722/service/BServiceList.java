package com.site.ex0722.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0722.dao.BDao;
import com.site.ex0722.vo.BVo;

public class BServiceList implements BService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bDao = new BDao();
		//총 게시글 수 int
		int page = 1; //현재 페이지
		int listCount = bDao.boardCountSelect();
		//하단넘버링 관련정보
		page = Integer.parseInt(request.getParameter("page"));
		int limit = 10; //게시글 수
		
		int maxpage = (int)((double)listCount/limit+0.99);
		int startPage = (int)((double)page/limit+0.99)-1*limit+1;
		int endPage = startPage+10-1;
		if (endPage>maxpage) endPage=maxpage;
		
		request.setAttribute("page", page);
		request.setAttribute("maxPage", maxpage);
		request.setAttribute("maxPage", maxpage);
		request.setAttribute("maxPage", maxpage);
		
		
		//10개데이터검색 범위
		int startrow = (page-1)*limit+1;
		int endrow = startrow+limit-1;
		
		
		
		//board 전체리스트 가져오기 - ArrayList
		ArrayList<BVo> list = bDao.boardAllSelect(startrow,startPage);
		request.setAttribute("list", list);

	
	}

}
