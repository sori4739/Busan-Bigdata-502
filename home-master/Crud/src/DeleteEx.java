import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEx {

	private static final String SQL = "delete from users where id = ?";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args) {
		//1.DB연결
		conn = DBConnection.getConnection();
		try {
			//2.쿼리작성
			pstmt = conn.prepareStatement(SQL);
			//3.쿼리완성
			pstmt.setInt(1, 2);
			//4.쿼리실행
			pstmt.executeUpdate();
			
			System.out.println("DELETE 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DELETE 실패");
		}
		

	}

}
