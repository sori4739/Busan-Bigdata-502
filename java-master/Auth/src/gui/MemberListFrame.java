package gui

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MemberListFrame extends JFrame {

	private String username; // ���ǰ�

	private String username; //���ǰ�

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberListFrame frame = new MemberListFrame();



					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	

	public MemberListFrame() {
		this(null);
	}

	/**
	 * Create the frame.
	 */
	public MemberListFrame(String username) {

		this.username = username;

		this.username =username;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1032, 584);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);



		

		JLabel label = new JLabel("\uD68C\uC6D0\uC815\uBCF4");
		label.setFont(new Font("���� ���", Font.BOLD, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label, BorderLayout.NORTH);


		// JTable ������ �����ϱ� (������, �÷��̸�, ���̺��)
		// 1.�÷��̸�
		Vector<String> memberName = Sample.getMemberName();
		// 2.������
		MemberDao dao = MemberDao.getInstance();
		Vector<Member> members = dao.findByAll();
		// 3.���̺��
		DefaultTableModel tableModel = new DefaultTableModel(memberName, 0);

		// 4.for�� ���鼭 �� �྿ ������ ����ֱ�

		
		//JTable ������ �����ϱ� (������, �÷��̸�, ���̺��)
		//1.�÷��̸�
		Vector<String> memberName = Sample.getMemberName();
		//2.������
		MemberDao dao = MemberDao.getInstance();
		Vector<Member> members = dao.findByAll();
		//3.���̺��
		DefaultTableModel tableModel = new DefaultTableModel(memberName,0);
		
		//4.for�� ���鼭 �� �྿ ������ ����ֱ�

		for (int i = 0; i < members.size(); i++) {
			Vector<Object> row = new Vector<Object>();
			row.addElement(members.get(i).getId());
			row.addElement(members.get(i).getUsername());
			row.addElement(members.get(i).getPassword());
			row.addElement(members.get(i).getName());
			row.addElement(members.get(i).getEmail());
			row.addElement(members.get(i).getPhone());
			row.addElement(members.get(i).getCreateDate());

			tableModel.addRow(row);// table �𵨿� �� �ֱ�
		}

		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1, 2));

		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setFont(new Font("����", Font.PLAIN, 15));
		panel.add(btnDelete);

		btnDelete.addActionListener(new ActionListener() {


			tableModel.addRow(row);//table �𵨿� �� �ֱ�
		}
		
		JTable table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridLayout(1,2));
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setFont(new Font("����", Font.PLAIN, 15));
		panel.add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������");
				System.out.println("������");
				int row = table.getSelectedRow();

				int result = (int) table.getValueAt(row, 0);
				System.out.println(table.getValueAt(row, 0));

				MemberDao dao = MemberDao.getInstance();
				dao.Delete(result);

				int DeleteResult = dao.Delete(result);
				// check for selected row first
				if (DeleteResult == 1) {
					// remove selected row from the model
					// UI����
					tableModel.removeRow(row);
				} else {
					System.out.println("DB���� ���� �ȵ� ��");
				}
			}
		});

		JButton btnLogout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		panel.add(btnLogout);
		btnLogout.setFont(new Font("����", Font.PLAIN, 15));

		btnLogout.addActionListener(new ActionListener() {


				int result =  (int) table.getValueAt(row, 0);
				System.out.println( table.getValueAt(row, 0));
				  // check for selected row first
		        if (row != -1) {
		            // remove selected row from the model
		            //UI����
		        	tableModel.removeRow(row);
		            
		            MemberDao dao = MemberDao.getInstance();
		         
		            dao.Delete(result);
			}
		}
		});
		
		JButton btnLogout = new JButton("\uB85C\uADF8\uC544\uC6C3");
		panel.add(btnLogout);
		btnLogout.setFont(new Font("����", Font.PLAIN, 15));
		
		btnLogout.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α׾ƿ� ����~");
				dispose();
				new LoginFrame();
			}
		});


		if (username == null) {
			JOptionPane.showMessageDialog(null, "�������� ���� ������Դϴ�");
			dispose();
		} else {
			

		
		if(username == null) {
			JOptionPane.showMessageDialog(null, "�������� ���� ������Դϴ�");
			dispose();
		}else {

			setVisible(true);
		}
	}

}
