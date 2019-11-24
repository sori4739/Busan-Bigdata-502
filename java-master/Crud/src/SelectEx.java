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
		//1.DB연결
		conn = DBConnection.getConnection();
	
		try {
			//2.쿼리작성
			pstmt = conn.prepareStatement(SQL);
			//3.쿼리 완성
			pstmt.setInt(1, 1);
			//4.쿼리실행
			rs =pstmt.executeQuery();
			//5.SQL 결과 가공 rs -> users 하나면 모델만들기 , 여러개면 컬렉션만들어 넣기
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
			System.out.println("select 실패");
			e.printStackTrace();
		}
		

	}

}
