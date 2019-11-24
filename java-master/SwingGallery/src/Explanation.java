import java.awt.BorderLayout;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JViewport;

public class Explanation extends JFrame  {
	
	private JPanel southPanel;
	private int currentId = 0;
	private ImageIcon[] images = new ImageIcon[4];
	private JLabel la;
	
	
	public Explanation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		ImageIcon img1 = new ImageIcon("images/image0.jpg");
		ImageIcon img2 = new ImageIcon("images/image1.jpg");
		ImageIcon img3 = new ImageIcon("images/image2.jpg");
		ImageIcon img4 = new ImageIcon("images/image3.jpg");
		images[0] = img1;
		images[1] = img2;
		images[2] = img3;
		images[3] = img4;
		
		la = new JLabel(images[currentId]);
		
		add(la,BorderLayout.CENTER);
		
		southPanel = new JPanel();
		
		ImageIcon leftImg = new ImageIcon("images/left.png");
		ImageIcon	rightImg = new ImageIcon("images/right.png");
		
		JButton leftBtn = new JButton(leftImg);
		JButton rightBtn = new JButton(rightImg);
		
		southPanel.add(leftBtn);
		southPanel.add(rightBtn);
		
		leftBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId--;
				if(currentId < 0 ) {
					currentId = 3;
				}
				la.setIcon(images[currentId]);
				
			}
		});
		
		rightBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				currentId++;
				if(currentId == 4) {
					currentId = 0;
				}
				la.setIcon(images[currentId]);
				
			}
		});
		
		add(southPanel,BorderLayout.SOUTH);
		setSize(300,400);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Explanation();

	}

}
