import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class SelectEx {

	private static final String SQL ="select * from users where id =?";
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	
	public static void main(String[] args) {
		//1.DB����
		conn = DBConnection.getConnection();
	
		try {
			//2.�����ۼ�
			pstmt = conn.prepareStatement(SQL);
			//3.���� �ϼ�
			pstmt.setInt(1, 1);
			//4.��������
			rs =pstmt.executeQuery();
			//5.SQL ��� ���� rs -> users �ϳ��� �𵨸���� , �������� �÷��Ǹ���� �ֱ�
			Users u = new Users();
			if(rs.next()) {
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4 ));
				System.out.println("id : "+u.getId());
				System.out.println("name : "+u.getName());
				System.out.println("email : "+u.getEmail());
				System.out.println("password : "+u.getPassword());
			}
			
		} catch (SQLException e) {
			System.out.println("select ����");
			e.printStackTrace();
		}
		

	}

}
