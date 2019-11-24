package action.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import dao.BoardDao;
import models.Board;

public class BoardDetailAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//주소창으로 바로 접근하는것을 방지
		//1.파라메터 받기 ID
		if(request.getParameter("id") == null || request.getParameter("id").equals("")) {
			return;
		}
		
		int id = Integer.parseInt(request.getParameter("id"));
		//2.DAO에 접근하여 데이터 가져오기 
		BoardDao dao =  new BoardDao();
		Board board = dao.findById(id);
		//3.request 저장
		request.setAttribute("board", board);
		//4.detail.jsp로 이동
		RequestDispatcher dis = request.getRequestDispatcher("detail.jsp");
		dis.forward(request, response);
		
	}
}
