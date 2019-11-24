package action.blog;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import models.Member;

public class BlogPostAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.데이터 담기
		Member members = new Member("홍길동", "부산진구");
		request.setAttribute("Member", members);
		//2.이동
		String url = "post.jsp";
		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request, response);		
	}
	
}
