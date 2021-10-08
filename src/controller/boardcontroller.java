package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Board;
import service.face.BoardService;
import service.impl.BoardServiceImpl;

@WebServlet("/board/list")
public class boardcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BoardService boardService = new BoardServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//boardService에서 게시글 전체 조회 리스트를 getList()메소드를 이용해 req에 담아서 boardlist에 저장
		List<Board> boardlist = boardService.getList(req);
		
		req.setAttribute("boardlist", boardlist);
		
		
		req.getRequestDispatcher("/WEB-INF/views/list.jsp").forward(req, resp);
	}

}
