import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertEx {

	private static final String SQL = "insert INTO users values(?, ?, ?, ?)";

	private static Connection conn;
	private static PreparedStatement pstmt;
	
	
	public static void main(String[] args) {
		//1.DB ����
		conn = DBConnection.getConnection();
		try {
			//2. Query �ۼ�
			pstmt = conn.prepareStatement(SQL);
			//3. Query �ϼ�(id,name,email,password)
			pstmt.setInt(1, 3);
			pstmt.setString(2, "�嵿��");
			pstmt.setString(3, "hong@nate.com");
			pstmt.setString(4, "1234");
			//4. Query ����
			pstmt.executeUpdate();
			System.out.println("Insert ����");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Insert ����");
		}

	}

}
