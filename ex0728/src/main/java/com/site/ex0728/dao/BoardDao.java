package com.site.ex0728.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.site.ex0728.vo.BoardVo;

public class BoardDao {
	
	DataSource ds=null;
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	int bid,bgroup,bstep,bindent,bhit;
	String btitle,bcontent,bname,bupload;
	Timestamp bdate;
	
	// 모든 게시글 수
	public int boardCountSelect(String category, String keyword) {
		int listcount=0;
		try {
			conn = getConnection();
			String sql="";
			switch (category) {
				case "": {
					sql = "select count(*) count from board";
					pstmt = conn.prepareStatement(sql);
					break;
				}
				case "all": {
					sql = "select count(*) count from board\r\n"
							+ "where btitle like ? or bcontent like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					pstmt.setString(2, "%"+keyword+"%");
					break;
				}
				case "btitle": {
					sql = "select count(*) count from board\r\n"
							+ "where btitle like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					break;
				}
				case "bcontent": {
					sql = "select count(*) count from board\r\n"
							+ "where bcontent like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					break;
				}
			}//switch
			rs = pstmt.executeQuery();
			if(rs.next()) {
				listcount = rs.getInt("count");
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
		return listcount;
	}
	
	
	//모든 게시글 내용검색 -> ArrayList
	public ArrayList<BoardVo> boardAllSelect(int startrow, int endrow, String category, String keyword){
		System.out.println("boardAllSelect1");
		ArrayList<BoardVo> list =  new ArrayList<BoardVo>();
		try {
			conn = getConnection();
			String sql="";
			switch (category) {
				case "": {
					sql = "select * from\r\n"
						+ "(select rownum rnum,b.* from\r\n"
						+ "(select * from board order by bgroup desc,bstep asc) b)\r\n"
						+ "where rnum>=? and rnum<=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, startrow);
					pstmt.setInt(2, endrow);
					break;
				}
				case "all": {
					sql = "select * from\r\n"
							+ "(select rownum rnum,b.* from\r\n"
							+ "(select * from board order by bgroup desc,bstep asc) b\r\n"
							+ "where btitle like ? or bcontent like ?)\r\n"
							+ "where rnum>=? and rnum<=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					pstmt.setString(2, "%"+keyword+"%");
					pstmt.setInt(3, startrow);
					pstmt.setInt(4, endrow);
					break;
				}
				case "btitle": {
					sql = "select * from\r\n"
							+ "(select rownum rnum,b.* from\r\n"
							+ "(select * from board order by bgroup desc,bstep asc) b\r\n"
							+ "where btitle like ?)\r\n"
							+ "where rnum>=? and rnum<=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					pstmt.setInt(2, startrow);
					pstmt.setInt(3, endrow);
					break;
				}
				case "bcontent": {
					sql = "select * from\r\n"
							+ "(select rownum rnum,b.* from\r\n"
							+ "(select * from board order by bgroup desc,bstep asc) b\r\n"
							+ "where bcontent like ?)\r\n"
							+ "where rnum>=? and rnum<=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, "%"+keyword+"%");
					pstmt.setInt(2, startrow);
					pstmt.setInt(3, endrow);
					break;
				}
			}//switch
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bid = rs.getInt("bid");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bname = rs.getString("bname");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getTimestamp("bdate");
				bupload = rs.getString("bupload");
				bhit = rs.getInt("bhit");
				list.add(new BoardVo(bid,btitle,bcontent,bname,bgroup,bstep,bindent,bdate,bupload,bhit));
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
		return list;
	}
	
	
	
	// -----------------------------------------------------
	// web.xml -> jdbc/Oracle11g에서 DataSource 를 가져옴.
	public Connection getConnection() throws Exception {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");  //web.xml -> jdbc/Oracle11g라는 이름을 가져옴
		return ds.getConnection();
	}




	
	
	

}
