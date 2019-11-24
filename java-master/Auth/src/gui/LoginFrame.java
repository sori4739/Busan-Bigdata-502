package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.MemberDao;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername, tfPassword;
	private JButton btnJoin;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		setLocationRelativeTo(null);
		 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("���� ���", Font.BOLD, 16));
		lblUsername.setBounds(47, 52, 86, 40);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PassWord");
		lblPassword.setFont(new Font("���� ���", Font.BOLD, 16));
		lblPassword.setBounds(47, 121, 86, 40);
		contentPane.add(lblPassword);
		
		tfUsername = new JTextField();
		tfUsername.setBounds(145, 64, 165, 28);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);
		
		tfPassword = new JTextField();
		tfPassword.setColumns(10);
		tfPassword.setBounds(145, 133, 165, 28);
		contentPane.add(tfPassword);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.setBounds(198, 190, 112, 34);
		contentPane.add(btnLogin);
		
		btnJoin = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnJoin.setBounds(80, 190, 112, 34);
		contentPane.add(btnJoin);
		setVisible(true);
		
		//������!! �̺�Ʈ�ҽ� +�Լ�
		
		//�α��� ������
		btnLogin.addActionListener(new ActionListener() {
			//�α��� �ڵ鷯
			@Override
			public void actionPerformed(ActionEvent e) {
				//DB�� ���̵�� ��� �ִ��� Ȯ�� �ؾ��� , DB�����ؼ�
				String username = tfUsername.getText();
				String password = tfPassword.getText();
				
				MemberDao dao = MemberDao.getInstance();
				int result = dao.findByUsernameAndPassword(username, password);
			
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "�α��� ����!!");
					//ȸ������ ����Ʈ ȭ�� �̵� + username ������ �ѱ�.
					MemberListFrame mlf = new MemberListFrame(username);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "�α��� ������ ��");
				}
			}
		});
		
		//ȸ������ ������
		btnJoin.addActionListener(new ActionListener() {
			//ȸ������ �ڵ鷯
			@Override
			public void actionPerformed(ActionEvent e) {
				//ȸ������ ���������� �̵�
				JoinFrame jf = new JoinFrame();
			}
		});
	}
}
