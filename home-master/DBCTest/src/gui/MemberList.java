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
		
		//JTable ������ �����ϱ� (������, �÷��̸�, ���̺��)
		//1.�÷��̸�
		Vector<String> memberName = ColumnName.getColumnName();
		//2.������
		MemberDB db = MemberDB.getInstance();
		Vector<Member> members = db.findByAll();
		//3.���̺��
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
			tableModel.addRow(row);//table �𵨿� �� �ֱ�
		}
		
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setFont(new Font("����", Font.PLAIN, 18));
		panel.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			//���� ��ư �ڵ鷯
			//DB���� Delete
			//UI������ ���� , remove
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ŭ���� �� ������ ���
				int row = table.getSelectedRow();
				int selectLow = (int) table.getValueAt(row, 0);
				
				MemberDB db = MemberDB.getInstance();
				int deleteResult = db.Delete(selectLow);
				
				if(deleteResult == 1) {
					tableModel.removeRow(row);
					JOptionPane.showMessageDialog(null, "�ش� ȸ�� ������ ���� �Ǿ����ϴ�.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "���� ! ���� ��������");
					dispose();
				}
				
			}
		});
		
		JButton btnLogout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnLogout.setFont(new Font("����", Font.PLAIN, 18));
		panel.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {
			//�α׾ƿ� ��ư �ڵ鷯
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 \uC815\uBCF4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
		
		setVisible(true);
	}

}
