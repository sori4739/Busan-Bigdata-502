import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEx {

	private static final String SQL = "insert INTO users values(?, ?, ?, ?)";

	private static Connection conn;
	private static PreparedStatement pstmt;
	
	
	public static void main(String[] args) {
		//1.DB 연결
		conn = DBConnection.getConnection();
		try {
			//2. Query 작성
			pstmt = conn.prepareStatement(SQL);
			//3. Query 완성(id,name,email,password)
			pstmt.setInt(1, 3);
			pstmt.setString(2, "장동건");
			pstmt.setString(3, "hong@nate.com");
			pstmt.setString(4, "1234");
			//4. Query 실행
			pstmt.executeUpdate();
			System.out.println("Insert 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Insert 실패");
		}

	}

}
