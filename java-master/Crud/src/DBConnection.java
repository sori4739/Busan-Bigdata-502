import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	//url , id , pw
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"cos",
					"bitc5600"
					);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
