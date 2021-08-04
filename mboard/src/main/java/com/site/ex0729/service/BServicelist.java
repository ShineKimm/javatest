package com.site.ex0729.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.site.ex0729.dao.BoardDao;
import com.site.ex0729.vo.BVo;

public class BServicelist implements BService {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) {
		BoardDao boardDao = new BoardDao();
		ArrayList<BVo> list = boardDao.blistAllSelect();
		
		request.setAttribute("list", list);
	}

}
