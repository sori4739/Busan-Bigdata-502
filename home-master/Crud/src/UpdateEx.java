import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEx {

	private static final String SQL = "update users set name = ? where id = ?";
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	
	public static void main(String[] args) {
		//1.DB楷搬
		conn = DBConnection.getConnection();
		
		try {
			//2.孽府累己
			pstmt = conn.prepareStatement(SQL);
			//3.孽府 肯己
			pstmt.setString(1, "ssar");
			pstmt.setInt(2, 1);
			//4.孽府 角青
			pstmt.executeUpdate();
			System.out.println("诀但 己傍");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("诀但 角菩 で");
		}

	}

}
