import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteEx {

	private static final String SQL = "delete from users where id = ?";
	
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	public static void main(String[] args) {
		//1.DB����
		conn = DBConnection.getConnection();
		try {
			//2.�����ۼ�
			pstmt = conn.prepareStatement(SQL);
			//3.�����ϼ�
			pstmt.setInt(1, 2);
			//4.��������
			pstmt.executeUpdate();
			
			System.out.println("DELETE ����");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DELETE ����");
		}
		

	}

}
