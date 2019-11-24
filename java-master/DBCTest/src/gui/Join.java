package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Timestamp;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import db.MemberDB;
import models.Member;
import oracle.sql.TIMESTAMP;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField tfusername;
	private JTextField tfpassword;
	private JTextField tfname;
	private JTextField tfemail;
	private JTextField tfphone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Join() {
		setTitle("Join");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 542);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("돋움", Font.PLAIN, 24));
		lblNewLabel.setBounds(147, 66, 123, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(60, 140, 105, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 18));
		lblPassword.setBounds(60, 187, 105, 35);
		contentPane.add(lblPassword);
		
		JLabel lblName = new JLabel("name");
		lblName.setFont(new Font("굴림", Font.BOLD, 18));
		lblName.setBounds(60, 234, 105, 35);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setFont(new Font("굴림", Font.BOLD, 18));
		lblEmail.setBounds(60, 281, 105, 35);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("phone");
		lblPhone.setFont(new Font("굴림", Font.BOLD, 18));
		lblPhone.setBounds(60, 331, 105, 35);
		contentPane.add(lblPhone);
		
		tfusername = new JTextField();
		tfusername.setBounds(165, 142, 205, 33);
		contentPane.add(tfusername);
		tfusername.setColumns(10);
		
		tfpassword = new JTextField();
		tfpassword.setColumns(10);
		tfpassword.setBounds(165, 194, 205, 33);
		contentPane.add(tfpassword);
		
		tfname = new JTextField();
		tfname.setColumns(10);
		tfname.setBounds(165, 241, 205, 33);
		contentPane.add(tfname);
		
		tfemail = new JTextField();
		tfemail.setColumns(10);
		tfemail.setBounds(165, 288, 205, 33);
		contentPane.add(tfemail);
		
		tfphone = new JTextField();
		tfphone.setColumns(10);
		tfphone.setBounds(165, 333, 205, 33);
		contentPane.add(tfphone);
		
		JButton btnJoinComplete = new JButton("\uD68C\uC6D0\uAC00\uC785 \uC644\uB8CC");
		btnJoinComplete.setFont(new Font("돋움", Font.PLAIN, 18));
		btnJoinComplete.setBounds(204, 391, 166, 35);
		contentPane.add(btnJoinComplete);
		
		btnJoinComplete.addActionListener(new ActionListener() {
			//회원 가입 완료 버튼 핸들러
			//DB에 입력 값 들 INSERT
			@Override
			public void actionPerformed(ActionEvent e) {
				Member member = new Member();
				member.setUsername(tfusername.getText());
				member.setPassword(tfpassword.getText());
				member.setName(tfname.getText());
				member.setEmail(tfemail.getText());
				member.setPhone(tfphone.getText());
				member.setCreatDate(java.sql.Timestamp.valueOf(LocalDateTime.now()));
				
				MemberDB db = MemberDB.getInstance();
				int saveResult = db.save(member);
				
				if(saveResult == 1) {
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "회원가입 실패하였습니다.");
					dispose();
				}
				
			}
		});
		
		setVisible(true);
	}

}
