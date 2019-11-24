package action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;
import util.Script;

public class BoardUpdateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id")==null || request.getParameter("id").equals("")) {
			return;
		}
		int id = Integer.parseInt(request.getParameter("id"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setId(id);
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		
		BoardDao dao = new BoardDao();
		int result = dao.update(board);
		
		if(result == 1) {
			response.sendRedirect("/board/BoardController?cmd=detail&id="+board.getId());
		}else {
			Script.back(response);
		}
		

	}

}
