package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import columnName.ColumnName;
import db.MemberDB;
import models.Member;

public class MemberList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberList frame = new MemberList();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberList() {
		setTitle("MemberList");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1, 2));
		
		//JTable 데이터 매핑하기 (데이터, 컬럼이름, 테이블모델)
		//1.컬럼이름
		Vector<String> memberName = ColumnName.getColumnName();
		//2.데이터
		MemberDB db = MemberDB.getInstance();
		Vector<Member> members = db.findByAll();
		//3.테이블모델
		DefaultTableModel tableModel = new DefaultTableModel(memberName,0);
		
		for (int i = 0; i < members.size(); i++) {
			Vector<Object> row = new Vector<Object>();
			row.addElement(members.get(i).getId());
			row.addElement(members.get(i).getUsername());
			row.addElement(members.get(i).getPassword());
			row.addElement(members.get(i).getName());
			row.addElement(members.get(i).getEmail());
			row.addElement(members.get(i).getPhone());
			row.addElement(members.get(i).getCreatDate());
			tableModel.addRow(row);//table 모델에 행 넣기
		}
		
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setFont(new Font("돋움", Font.PLAIN, 18));
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			//삭제 버튼 핸들러
			//DB에서 Delete
			//UI에서도 제거 , remove
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭한 행 변수에 담기
				int row = table.getSelectedRow();
				int selectLow = (int) table.getValueAt(row, 0);
				
				MemberDB db = MemberDB.getInstance();
				int deleteResult = db.Delete(selectLow);
				
				if(deleteResult == 1) {
					tableModel.removeRow(row);
					JOptionPane.showMessageDialog(null, "해당 회원 정보가 삭제 되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "오류 ! 삭제 되지않음");
					dispose();
				}
				
			}
		});
		
		JButton btnLogout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnLogout.setFont(new Font("돋움", Font.PLAIN, 18));
		panel.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			//로그아웃 버튼 핸들러
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}

}
