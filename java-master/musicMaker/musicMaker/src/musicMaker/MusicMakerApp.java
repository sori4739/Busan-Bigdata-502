package musicMaker;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JMenuItem;

public class MusicMakerApp extends JFrame {

	private JPanel contentPane;
	private JTextField tfTime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MusicMakerApp frame = new MusicMakerApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MusicMakerApp() {
		setTitle("MusicMaker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setResizable(false);//≈©±‚∞Ì¡§
		//setMinimumSize(new Dimension(900, 500)); // √÷º“≈©±‚

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mnSaveItem = new JMenuItem("\uC800\uC7A5");
		mnNewMenu.add(mnSaveItem);
		mnNewMenu.addSeparator();
		
		JMenuItem mnSaveItem2 = new JMenuItem("\uB2E4\uB978\uC774\uB984\uC73C\uB85C \uC800\uC7A5");
		mnNewMenu.add(mnSaveItem2);
		mnNewMenu.addSeparator();
		
		JMenuItem mnLogoutItem = new JMenuItem("\uB85C\uADF8\uC544\uC6C3");
		mnNewMenu.add(mnLogoutItem);
		mnNewMenu.addSeparator();
		
		JMenuItem mnExitItem = new JMenuItem("\uC885\uB8CC");
		mnNewMenu.add(mnExitItem);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 14));
		menuBar.add(mnHelp);
		
		JMenuItem mnHelpItem = new JMenuItem("Help");
		mnHelp.add(mnHelpItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelTop = new JPanel();
		panelTop.setBackground(Color.RED);
		panelTop.setBounds(220, 0, 1374, 46);
		contentPane.add(panelTop);
		panelTop.setLayout(null);
		
		JButton btnPlay = new JButton("\u25B6");
		btnPlay.setBackground(Color.DARK_GRAY);
		btnPlay.setForeground(new Color(154, 205, 50));
		btnPlay.setFont(new Font("±º∏≤", Font.PLAIN, 12));
		btnPlay.setBounds(0, 0, 46, 46);
		panelTop.add(btnPlay);
		
		JButton btnStop = new JButton("\u25A0");
		btnStop.setBackground(Color.DARK_GRAY);
		btnStop.setForeground(new Color(154, 205, 50));
		btnStop.setBounds(49, 0, 46, 46);
		panelTop.add(btnStop);
		
		tfTime = new JTextField();
		tfTime.setHorizontalAlignment(SwingConstants.RIGHT);
		tfTime.setFont(new Font("Arial", Font.BOLD, 24));
		tfTime.setForeground(Color.WHITE);
		tfTime.setBackground(Color.DARK_GRAY);
		tfTime.setText("00:00:00");
		tfTime.setBounds(99, 0, 161, 46);
		panelTop.add(tfTime);
		tfTime.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(120), null, null, new Integer(1)));
		spinner.setFont(new Font("Arial", Font.BOLD, 24));
		spinner.setForeground(Color.WHITE);
		spinner.setBackground(Color.DARK_GRAY);
		spinner.setBounds(293, 0, 132, 46);
		panelTop.add(spinner);
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(Color.DARK_GRAY);
		panelMain.setBounds(220, 56, 1374, 794);
		contentPane.add(panelMain);
		
		JPanel panelFile = new JPanel();
		panelFile.setBackground(Color.YELLOW);
		panelFile.setBounds(0, 0, 208, 850);
		contentPane.add(panelFile);
	}
}
