package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.board.BoardFactory;


@WebServlet("/BoardController")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BoardController() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 접근입니다.");
		//받아오는 데이터 전부 UTF-8로 해서 안깨지게 설정
		request.setCharacterEncoding("UTF-8");
		//http://localhost:8000/board/BoardController?cmd=list
		String cmd = request.getParameter("cmd");//cmd = list
		
		if(cmd == null) cmd = "list";
		
		Action action = BoardFactory.getAction(cmd);
		if(action != null) {
			action.execute(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 접근입니다.");
		doGet(request, response);
	}

}
