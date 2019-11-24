
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
	
	private Connection conn; //DB���� ��ü
	private PreparedStatement pstmt; //Query �ۼ� ��ü
	private ResultSet rs; //Query ��� �������� ù ��° ���� Ŀ��
	
	//ȸ������ �޼ҵ�
	//���� 1, �����ϸ� -1 ����
	public int save(Member member) {
		//1.DB����
		conn = DBConnection.getConnection();
		
		//�������� ��� ���ܹ߻��Ҽ����� Ʈ����ĳġ
	
		try {
			//2.Query �ۼ�
			pstmt = conn.prepareStatement("insert into member values(member_seq.nextval, ?,?,?,?,?,?)");
			
			//3.Query �ϼ�
			pstmt.setString(1, member.getUsername());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getPhone());
			pstmt.setTimestamp(6, member.getCreateDate());
			
			//4.Query ����
			//(1) select -> ResultSet rs = pstmt.executeQuery();
			//(2) insert , update , delete = pstmt.executeUpdate();
			pstmt.executeUpdate();
			return 1;//����
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1;//����
	}
	//�α���
	public int findByUsernameAndPassword(String username, String password) {
		//select * from member Where username =? , and password = ?
		//1.DB ����
		
		conn = DBConnection.getConnection();
		
		try {
			//2.���� �ۼ�
			pstmt = conn.prepareStatement("select id from member where username = ? and password = ?");
			//3.���� �ϼ�
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			//4.���� ����
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				return 1;//�α��� ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;//�α��� ����
	}
	
	//ȸ������ ����
	public Vector<Member> findByAll(){
		//�÷��� ����� member ���� ����
		Vector<Member> members = new Vector<Member>();
		
		//1.DB����
		conn = DBConnection.getConnection();
		
		//��� ���ܹ߻�
		try {
			//2.Query �ۼ�
			pstmt = conn.prepareStatement("select * from member");
			//3.Query �ϼ�
			
			//4.Query ����
			rs = pstmt.executeQuery();
			//5.��� ����
			
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
			//�����ۼ�
			pstmt = conn.prepareStatement("delete from member where id = ?");
			//�����Ϸ�
			pstmt.setInt(1, result);
			//��������
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB��������");

			return -1;//��������


		}
		
		return 1;//��������
	}
}
