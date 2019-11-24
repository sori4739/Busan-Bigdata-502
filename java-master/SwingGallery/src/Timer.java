import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Timer extends JFrame implements Runnable{

	private JLabel label;
	
	public Timer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		String time = getCurrentTime();
		label = new JLabel(time);
		label.setFont(new Font("TimesRoman", Font.ITALIC,50));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		add(label,BorderLayout.CENTER);
		setSize(300,200);
		
		Thread t1 = new Thread(this);
		t1.start();
		
		setVisible(true);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				String time = getCurrentTime();
				label.setText(time);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public String getCurrentTime() {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		String time = hour+":"+ min + ":"+ sec;
		return time;
	}
	public static void main(String[] args) {
		new Timer();
	}
}
