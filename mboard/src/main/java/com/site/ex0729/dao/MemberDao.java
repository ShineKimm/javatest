package com.site.ex0729.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.ex0729.vo.MVo;

public class MemberDao {
	
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String id,pw,name,nickname,gender,tel,address1,addres2,hobby;
	
	public MVo mLoginSelect(String id,String pw) {
		MVo mVo = new MVo();
		try {
			conn = getConnection();
			String sql = "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(1, pw);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				nickname = rs.getString("nickname");
				gender = rs.getString("gender");
				tel = rs.getString("tel");
				address1 = rs.getString("address1");
				addres2 = rs.getString("addres2");
				hobby = rs.getString("hobby");
				mVo = new MVo(id,pw,name,nickname,gender,tel,address1,addres2,hobby);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return mVo;
	}
	
	
	public Connection getConnection() throws Exception{
		Context context = new InitialContext();
		ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		return ds.getConnection();
	}
	
	
}
