package action.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import dao.DBConn;
import models.Board;
import util.Script;

public class BoardDeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ID 받기
		if (request.getParameter("id") == null || request.getParameter("id").equals("")) {
			return;
		}
		int id = Integer.parseInt(request.getParameter("id"));

		// DAO 접근
		BoardDao dao = new BoardDao();
		int result = dao.delete(id);
		// list 서블릿 호출
		if (result == 1) {
			response.sendRedirect("/board/BoardController?cmd=list");
		} else {
			// 뒤로가기
			Script.back(response);
		}

	}
}
