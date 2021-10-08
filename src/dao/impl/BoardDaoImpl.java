package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.JDBCTemplate;
import dao.face.BoardDao;
import dto.Board;

public class BoardDaoImpl implements BoardDao {

	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	@Override
	public List<Board> selectAll(Connection conn) {
		
		
		String sql = "";
		sql += "SELECT * FROM board";
		sql += " ORDER BY boardno DESC";
		
		List<Board> boardlist = new ArrayList<>();
		
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				Board b = new Board(); //결과값 저장 객체
				
				//결과값 한 행 처리
				b.setBoardno(rs.getInt("boardno"));
				b.setTitle( rs.getString("title") );
				b.setUserid( rs.getString("userid") );
				b.setContent( rs.getString("content") );
				b.setHit( rs.getInt("hit") );
				b.setWriteDate( rs.getDate("write_date") );
				
				//리스트에 결과값 저장
				boardlist.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		
		
		return boardlist;
	}

}
