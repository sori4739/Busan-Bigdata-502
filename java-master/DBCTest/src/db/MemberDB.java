package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import models.Member;

public class MemberDB {
	private MemberDB() {} // 생성자 private 다른 곳 에서 객체 생성 할수없음
	private static MemberDB instance = new MemberDB();// 스태틱으로 메모리 항시 띄어놔야 사용가능
	public static MemberDB getInstance() {
		return instance;// 생성한 객체를 리턴 , 싱글톤 패턴
	}

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 회원가입 완료 버튼클릭시 DB에 INSERT
	public int save(Member member) {
		// 1.디비 연결
		conn = DBConnection.getConnection();
		try {
			// 2.쿼리작성 (통신 try)
			pstmt = conn.prepareStatement("insert into member values(member_seq.nextval,?,?,?,?,?,?)");
			// 3.쿼리완성
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getPhone());
			pstmt.setTimestamp(6, member.getCreatDate());
			// 4.쿼리실행
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;// 저장실패
		}
		return 1; // 저장 성공
	}

	// 로그인 버튼 클릭시 SELECT 해서 정보있는지 확인
	public int findByUsernameAndPassword(String username, String password) {
		// 1.DB 연결
		conn = DBConnection.getConnection();
		try {
			// 쿼리작성
			pstmt = conn.prepareStatement("select id from member where username = ? and password = ?");
			// 완성
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			// 실행
			rs = pstmt.executeQuery();
			// 가공
			if (rs.next()) {
				return 1;
				// 일치 데이터 있음, 로그인 성공,회원 정보 창 띄우기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -1;
		// 일치 데이터 없음, 재 로그인 창
	}

	// 회원정보 프레임에서 삭제버튼 클릭시 DB에서 Delete
	public int Delete(int selectRow) {
		// DB연결
		conn = DBConnection.getConnection();
		try {
			// 쿼리작성
			pstmt = conn.prepareStatement("delete from member where id = ?");
			// 쿼리완성
			pstmt.setInt(1, selectRow);
			// 쿼리실행
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;// 삭제 완료.
	}

	// 회원정보 보기
	public Vector<Member> findByAll() {
		// 컬렉션 만들기 member 변수 담을
		Vector<Member> members = new Vector<Member>();

		// 1.DB연결
		conn = DBConnection.getConnection();

		// 통신 예외발생
		try {
			// 2.Query 작성
			pstmt = conn.prepareStatement("select * from member");
			// 3.Query 완성

			// 4.Query 실행
			rs = pstmt.executeQuery();
			// 5.결과 가공

			while (rs.next()) {
				Member member = new Member();
				member.setId(rs.getInt("id"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setName(rs.getString("name"));
				member.setPhone(rs.getString("phone"));
				member.setCreatDate(rs.getTimestamp("createDate"));
				members.add(member);
			}
		} catch (Exception e) {

		}

		return members;
	}

}
