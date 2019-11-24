import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateEx {

	private static final String SQL = "update users set name = ? where id = ?";
	private static Connection conn;
	private static PreparedStatement pstmt;
	
	
	public static void main(String[] args) {
		//1.DB����
		conn = DBConnection.getConnection();
		
		try {
			//2.�����ۼ�
			pstmt = conn.prepareStatement(SQL);
			//3.���� �ϼ�
			pstmt.setString(1, "ssar");
			pstmt.setInt(2, 1);
			//4.���� ����
			pstmt.executeUpdate();
			System.out.println("���� ����");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� ���� ��");
		}

	}

}
