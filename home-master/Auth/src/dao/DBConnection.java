package dao;

import java.sql.Connection;
import java.sql.DriverManager;

//Data Access Object
public class DBConnection {
   public static Connection getConnection() {
      Connection conn = null;
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String id = "cos";
      String pw = "bitc5600";
      String driver = "oracle.jdbc.driver.OracleDriver";
      
 
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, pw);
         System.out.println("DB연결 완료");
      } catch (Exception e) {
         e.printStackTrace();
        System.out.println("DB연결 실패");
      }
      
      return conn;
   }
   
   
}