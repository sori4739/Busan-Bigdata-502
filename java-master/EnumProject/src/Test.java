
interface Insert{
	int SUCCESS = 1 , ERROR = -1;
}

interface Delete{
	int SUCCESS = 1 , ERROR = -1;
}

interface Update{
	int SUCCESS = 1 , ERROR = -1;
}

interface Select{
	int SUCCESS = 1 , ERROR = -1;
}


public class Test {
	
	//Insert
	/**
	 * 정상 : 1 
	 * 실패 : -1
	 * 
	 * 	 */
	
	public int save() {
		return Insert.SUCCESS;
	}
	
	public int delete() {
		return Delete.ERROR;
	}
	
	public static void main(String[] args) {
		
	}
}
