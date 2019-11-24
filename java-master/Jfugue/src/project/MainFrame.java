package project;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("\uB3C4");
		btn1.setBounds(46, 53, 97, 23);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Player player = new Player();
				player.play("67 67 69 69 67 67 64 R 67 67 64 64 62");
				
			}
		});
		
		JButton btn2 = new JButton("\uB808");
		btn2.setBounds(46, 96, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("\uBBF8");
		btn3.setBounds(46, 141, 97, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("\uD30C");
		btn4.setBounds(46, 176, 97, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("\uC194");
		btn5.setBounds(46, 214, 97, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("\uB77C");
		btn6.setBounds(46, 252, 97, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("\uC2DC");
		btn7.setBounds(46, 289, 97, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("\uB3C4");
		btn8.setBounds(46, 327, 97, 23);
		contentPane.add(btn8);
		
		setVisible(true);
	}
}
