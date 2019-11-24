
enum Db{
	INSERT , DELETE , UPDATE , SELECT;
	
	 final int SUCCESS = 1;
	 final int ERROR = -1;
	
//	private Db() {
//		System.out.println("생성자 호출");
//	}
}

public class Test3 {
	
	public static int save() {
		return Db.INSERT.SUCCESS;
	}
	
	public static int delete() {
		return Db.DELETE.SUCCESS;
	}
	
	public static void main(String[] args) {
		save();
		
		
	}
}
