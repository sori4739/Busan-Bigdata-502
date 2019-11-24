package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import models.Board;

public class BoardDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// ArrayList<Board>
	public ArrayList<Board> findByAll() {
		final String SQL = "SELECT * FROM board";
		ArrayList<Board> boards = new ArrayList<>();
		conn = DBConn.getConnection();
		try {
			pstmt = conn.prepareStatement(SQL);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				boards.add(board);
			}
			return boards;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return null;
	}

	public Board findById(int id) {

		final String SQL = "SELECT * FROM board WHERE id = ?";
		conn = DBConn.getConnection();
		try {
			pstmt = conn.prepareStatement(SQL);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			Board board = new Board();
			if (rs.next()) {
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
			}
			return board;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return null;
	}
	
	public int delete(int id) {
		final String SQL = "DELETE FROM board WHERE id = ?";
		conn = DBConn.getConnection();
		
		try {
			pstmt =conn.prepareStatement(SQL);
			
			pstmt.setInt(1, id);
			
			int result = pstmt.executeUpdate();
			
			return result;
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return -1;
	}
	
	public int save(Board board) {
		final String SQL = "INSERT INTO board VALUES(board_seq.nextval,?,?)";
		
		conn = DBConn.getConnection();
		
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			
			int result = pstmt.executeUpdate();
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return -1;
	}
	
	public int update(Board board) {
		final String SQL = "UPDATE board SET title=? , content = ? WHERE id = ?";
		conn = DBConn.getConnection();
		
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getId());
			
			int result = pstmt.executeUpdate();
			
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return -1;
	}
}
