package service.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dto.Board;

public interface BoardService {

	/**
	 * 게시글 목록 전체 조회
	 * 
	 * 
	 * @param req - 게시글 목록 전체 조회 리스트
	 * @return
	 */
	List<Board> getList(HttpServletRequest req);

}
