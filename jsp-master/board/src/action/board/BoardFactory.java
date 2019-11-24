package action.board;

import action.Action;

//객체를 리턴
public class BoardFactory {
	public static Action getAction(String cmd) {
		if(cmd.equals("")) {
			return new BoardListAction();
		}else if(cmd.equals("list")) {
			return new BoardListAction();
		}else if(cmd.equals("detail")) {
			return new BoardDetailAction();
		}else if(cmd.equals("delete")) {
			return new BoardDeleteAction();
		}else if(cmd.equals("writeForm")) {
			return new BoardWriteFormAction();
		}else if(cmd.equals("write")) {
			return new BoardWriteAction();
		}else if(cmd.equals("updateForm")) {
			return new BoardUpdateFormAction();
		}else if(cmd.equals("update")) {
			return new BoardUpdateAction();
		}
		
		return null;
	}
}
