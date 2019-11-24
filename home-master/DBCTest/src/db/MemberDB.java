package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import models.Member;

public class MemberDB {
	private MemberDB() {} // ������ private �ٸ� �� ���� ��ü ���� �Ҽ�����
	private static MemberDB instance = new MemberDB();// ����ƽ���� �޸� �׽� ������ ��밡��
	public static MemberDB getInstance() {
		return instance;// ������ ��ü�� ���� , �̱��� ����
	}

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// ȸ������ �Ϸ� ��ưŬ���� DB�� INSERT
	public int save(Member member) {
		// 1.��� ����
		conn = DBConnection.getConnection();
		try {
			// 2.�����ۼ� (��� try)
			pstmt = conn.prepareStatement("insert into member values(member_seq.nextval,?,?,?,?,?,?)");
			// 3.�����ϼ�
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getPhone());
			pstmt.setTimestamp(6, member.getCreatDate());
			// 4.��������
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;// �������
		}
		return 1; // ���� ����
	}

	// �α��� ��ư Ŭ���� SELECT �ؼ� �����ִ��� Ȯ��
	public int findByUsernameAndPassword(String username, String password) {
		// 1.DB ����
		conn = DBConnection.getConnection();
		try {
			// �����ۼ�
			pstmt = conn.prepareStatement("select id from member where username = ? and password = ?");
			// �ϼ�
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			// ����
			rs = pstmt.executeQuery();
			// ����
			if (rs.next()) {
				return 1;
				// ��ġ ������ ����, �α��� ����,ȸ�� ���� â ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return -1;
		// ��ġ ������ ����, �� �α��� â
	}

	// ȸ������ �����ӿ��� ������ư Ŭ���� DB���� Delete
	public int Delete(int selectRow) {
		// DB����
		conn = DBConnection.getConnection();
		try {
			// �����ۼ�
			pstmt = conn.prepareStatement("delete from member where id = ?");
			// �����ϼ�
			pstmt.setInt(1, selectRow);
			// ��������
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		return 1;// ���� �Ϸ�.
	}

	// ȸ������ ����
	public Vector<Member> findByAll() {
		// �÷��� ����� member ���� ����
		Vector<Member> members = new Vector<Member>();

		// 1.DB����
		conn = DBConnection.getConnection();

		// ��� ���ܹ߻�
		try {
			// 2.Query �ۼ�
			pstmt = conn.prepareStatement("select * from member");
			// 3.Query �ϼ�

			// 4.Query ����
			rs = pstmt.executeQuery();
			// 5.��� ����

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
