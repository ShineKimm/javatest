package com.site.ex0728.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.site.ex0728.dao.MemberDao;
import com.site.ex0728.vo.MemberVo;

public class MServiceDoLogin implements MService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		//로그인화면에서 id,pw를 넣고 로그인버튼을 클릭하면 id,pw 데이터가 넘어옴.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		MemberDao memberDao = new MemberDao();
		MemberVo memberVo = memberDao.mDoLoginSelect(id,pw);  //memberVo 1개
		//데이터가 있으면 id,pw가 일치, id,pw가 불일치
		if((memberVo.getId()!=null)) {
			session.setAttribute("session_id", memberVo.getId());
			session.setAttribute("session_nickname", memberVo.getNickname());
			session.setAttribute("session_flag", "success");
			System.out.println("session저장");
		}else {
			System.out.println("id,pw불일치");
		}
	}

}
