package action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;

public class BoardUpdateFormAction implements Action{
		@Override
		public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			if(request.getParameter("id")==null || request.getParameter("id").equals("")) {
				return;
			}
			int id = Integer.parseInt(request.getParameter("id"));
			
			BoardDao dao = new BoardDao();
			Board board = dao.findById(id);
			
			request.setAttribute("board", board);
			RequestDispatcher dis = request.getRequestDispatcher("updateForm.jsp");
			dis.forward(request, response);
		}
}
