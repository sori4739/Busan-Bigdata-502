
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import models.Member;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance(){
		return instance;
	}
	
	private Connection conn; //DB연결 객체
	private PreparedStatement pstmt; //Query 작성 객체
	private ResultSet rs; //Query 결과 데이터의 첫 번째 직전 커서
	
	//회원가입 메소드
	//성공 1, 실패하면 -1 리턴
	public int save(Member member) {
		//1.DB연결
		conn = DBConnection.getConnection();
		
		//이제부터 통신 예외발생할수있음 트라이캐치
	
		try {
			//2.Query 작성
			pstmt = conn.prepareStatement("insert into member values(member_seq.nextval, ?,?,?,?,?,?)");
			
			//3.Query 완성
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getPhone());
			pstmt.setTimestamp(6, member.getCreateDate());
			
			//4.Query 실행
			//(1) select -> ResultSet rs = pstmt.executeQuery();
			//(2) insert , update , delete = pstmt.executeUpdate();
			pstmt.executeUpdate();
			return 1;//정상
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;//실패
	}
	//로그인
	public int findByUsernameAndPassword(String username, String password) {
		//select * from member Where username =? , and password = ?
		//1.DB 연결
		
		conn = DBConnection.getConnection();
		
		try {
			//2.쿼리 작성
			pstmt = conn.prepareStatement("select id from member where username = ? and password = ?");
			//3.쿼리 완성
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			//4.쿼리 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				return 1;//로그인 성공
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;//로그인 실패
	}
	
	//회원정보 보기
	public Vector<Member> findByAll(){
		//컬렉션 만들기 member 변수 담을
		Vector<Member> members = new Vector<Member>();
		
		//1.DB연결
		conn = DBConnection.getConnection();
		
		//통신 예외발생
		try {
			//2.Query 작성
			pstmt = conn.prepareStatement("select * from member");
			//3.Query 완성
			
			//4.Query 실행
			rs = pstmt.executeQuery();
			//5.결과 가공
			
			while(rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setPhone(rs.getString("phone"));
				member.setCreateDate(rs.getTimestamp("createDate"));
				members.add(member);
			}
		} catch (Exception e) {
			
		}
		
		return members;
	}
	public int Delete(int result){
		
		conn = DBConnection.getConnection();
		
		try {
			//쿼리작성
			pstmt = conn.prepareStatement("delete from member where id = ?");
			//쿼리완료
			pstmt.setInt(1, result);
			//쿼리실행
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB삭제실패");

			return -1;//삭제실패


		}
		
		return 1;//삭제성공
	}
}
