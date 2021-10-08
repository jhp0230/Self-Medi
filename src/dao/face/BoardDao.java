package dao.face;

import java.sql.Connection;
import java.util.List;

import dto.Board;

public interface BoardDao {

	
	/**
	 * 게시글 전체 조회
	 * 
	 * 
	 * @param connection - DB연결 객체
	 * @return - List<Board> = Board테이블 전체 조회 리스트
	 */
	List<Board> selectAll(Connection conn);

}
