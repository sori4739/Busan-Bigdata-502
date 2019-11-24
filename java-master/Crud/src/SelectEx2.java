import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectEx2 {

	private static final String SQL = "select * from users";
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static ArrayList<Users> users;

	public static void main(String[] args) {
		users = new ArrayList<>();
		// 1.DB楷搬
		conn = DBConnection.getConnection();
		try {
			// 2.孽府累己
			pstmt = conn.prepareStatement(SQL);
			// 3.孽府 肯己

			// 4.孽府角青
			rs = pstmt.executeQuery();
			// 5.孽府啊傍 -< ArrayList
			
			
			while (rs.next()) {
				Users u = new Users();
				u.setId(rs.getInt(1));
				u.setName(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setPassword(rs.getString(4));
				users.add(u);
			}
			

			for (Users i : users) {
				System.out.println("id : " + i.getId());
				System.out.println("name : " + i.getName());
				System.out.println("email : " + i.getEmail());
				System.out.println("password : " + i.getPassword());
				System.out.println("======================");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
