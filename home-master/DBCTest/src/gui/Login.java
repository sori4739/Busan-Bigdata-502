package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import db.MemberDB;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField tfusername;
	private JTextField tfpassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(54, 41, 113, 58);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(54, 115, 113, 58);
		contentPane.add(lblPassword);
		
		tfusername = new JTextField();
		tfusername.setBounds(154, 51, 200, 39);
		contentPane.add(tfusername);
		tfusername.setColumns(10);
		
		tfpassword = new JTextField();
		tfpassword.setColumns(10);
		tfpassword.setBounds(154, 132, 200, 39);
		contentPane.add(tfpassword);
		
		JButton btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnJoin.setBounds(100, 196, 118, 33);
		contentPane.add(btnJoin);
		
		btnJoin.addActionListener(new ActionListener() {
			//회원가입 버튼 핸들러
			@Override
			public void actionPerformed(ActionEvent e) {
				Join join = new Join();
				
			}
		});
		
		btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.setBounds(236, 196, 118, 33);
		contentPane.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() {
			//로그인 버튼 핸들러
			//DB에 입력정보 있는지 확인 (SELECT)
			//있으면 회원정보 창 , 없으면 재 로그인 창
			@Override
			public void actionPerformed(ActionEvent e) {
					String username = tfusername.getText();
					String password  = tfpassword.getText();
					
					MemberDB db = MemberDB.getInstance();
					int findResult = db.findByUsernameAndPassword(username,password);
					
					if(findResult == 1) {
						JOptionPane.showMessageDialog(null, "로그인 성공.");
						MemberList ml = new MemberList();
					}else {
						JOptionPane.showMessageDialog(null, "로그인 실패.");
						dispose();
					}
			}
		});
		
		setVisible(true);
	}
}
