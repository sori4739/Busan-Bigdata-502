package action.blog;

import action.Action;

public class BlogFactory {
	public static Action getAction(String cmd) {
		if(cmd.equals("write")) {//글쓰기 페이지 //content = "내용입니다.";
			return new BlogWriteAction();
		}else if(cmd.equals("update")) {//수정 페이지//content = "수정입니다";
			return new BlogUpdateAction();
		}else if(cmd.equals("delete")) {//삭제 액션//바로이동//sendRedirect
			return new BlogDeleteAction();
		}else if(cmd.equals("list")) {//리스트 페이지//content = "리스트입니다.";
			return new BlogListAction(); 
		}else if(cmd.equals("view")) {//상세보기 페이지
			return new BlogViewAction();
		}else if(cmd.equals("post")) {
			return new BlogPostAction();
		}
		return null;
	}
}
